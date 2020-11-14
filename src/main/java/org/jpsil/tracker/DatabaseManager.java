package org.jpsil.tracker;

import java.sql.*;

public class DatabaseManager {

    private String url;

    private Connection connect() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(this.url);
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }


}
