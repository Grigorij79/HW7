package org.example;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePopulateService {
    public static final String SQL_POPULATE_DB = "sql/populate_db.sql";

    public static void main(String[] args) {

        Connection connection = Database.getInstance().getConnection();

        String sql = getSqlPopulateFromFile();

        populateDb(connection, sql);

        Database.getInstance().closeConnection();
    }

    private static void populateDb(Connection connection, String sql) {
        Statement statement;
        try{
            statement = connection.createStatement();
            statement.executeUpdate(sql);
            statement.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static String getSqlPopulateFromFile() {
        StringBuilder sql = new StringBuilder();

        try (FileReader fileReader = new FileReader(SQL_POPULATE_DB);){
            int reader = fileReader.read();
            while (reader != -1){
                sql.append((char) reader);
                reader = fileReader.read();
            }
        } catch (IOException e) {
            return null;
        }

        return sql.toString();
    }

}
