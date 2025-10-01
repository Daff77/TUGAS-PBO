/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumJavaGUI;

/**
 *
 * @author Daffa Danendra
 */
import JavaLoginGUI.*;
import JavaLoginGUI1.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {

    private static final String URL = "jdbc:postgresql://localhost:5432/LoginJava";
    private static final String USER = "postgres";
    private static final String PASSWORD = "Danendra07";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}   
