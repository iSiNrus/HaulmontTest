package ru.haulmont.db;

import org.hsqldb.jdbc.JDBCDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static String db = "jdbc:hsqldb:file:testdb";
    private static String user = "SA";
    private static String password = "";

    private static  Connection conn;

    static {
        try {
            conn = DriverManager.getConnection(db, user, password);
        } catch (SQLException e) {
            System.err.println("//ERROR DB CONNECTION//");
            System.err.println(e.getMessage());
            System.err.println("///ERROR DB CONNECTION////");
        }
    }

}
