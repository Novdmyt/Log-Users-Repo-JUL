package org.example.app.database;

import org.example.app.utils.Constants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    public static Connection connection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(Constants.DB_DRIVER +
                    Constants.DB_BASE_URL + Constants.DB_NAME);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }
}
