package com.informind;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseSample {
    private String dbURL = "jdbc:derby:MallDB;create=true";
    private String user = "admin";
    private String password = "admin";
    private Connection connection;

    public static final String CREATE_ITEMS_DB = "CREATE TABLE items (item_id INTEGER NOT NULL, " +
                    "item_name VARCHAR(20) NOT NULL, item_price REAL NOT NULL, multiplicity_shop INTEGER NOT NULL, " +
                    "multiplicity_store INTEGER NOT NULL)";
    public static final String INSERT_PRODUCT = "INSERT INTO items (item_id, item_name, item_price, multiplicity_shop, multiplicity_store) VALUES (?, ?, ?, ?, ?)";
    public static final String CLEAR_ITEMS_DB = "DELETE FROM items";

    protected Connection connectToDb() {
        try {
            connection = DriverManager.getConnection(dbURL, user, password);
            return connection;
        } catch (SQLException ex) {
            System.out.println("SQL exception - connectToDB(): " + ex.getMessage());
            return null;
        }
    }
}
