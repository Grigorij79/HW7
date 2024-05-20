package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DatabaseInitService {
    public static final String SQL_INIT_DB = "sql/init_db.sql";

    public static void main(String[] args) {
        Database database = Database.getInstance();
        initDB(database);
        Database.getInstance().closeConnection();
    }

    public static void initDB (Database database){
        try {
            String sql = String.join(
                    "\n",
                    Files.readAllLines(Paths.get(SQL_INIT_DB))
            );
            database.executeUpdate(sql);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
