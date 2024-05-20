package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

    private static final Database INSTANCE = new Database();
    private Connection connection;
    private Database() {
        try {
            connection = DriverManager.getConnection("jdbc:h2:./test");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public static Database getInstance(){
        return INSTANCE;
    }

    public Connection getConnection(){
        return connection;
    }

    public void closeConnection(){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public int executeUpdate(String sql){
        try(Statement statement = connection.createStatement();) {
            return statement.executeUpdate(sql);
        } catch (Exception ex) {
            ex.printStackTrace();

            return -1;
        }

    }
}
