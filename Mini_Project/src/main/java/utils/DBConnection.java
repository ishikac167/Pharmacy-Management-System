/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;
import java.sql.*;

/**
 *
 * @author Shilpi
 */
public class DBConnection {
    public Connection createConnection() throws ClassNotFoundException {
        try {
            Class<?> forName = Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy_management?user=root&password=Ishanika167");
            return conn;
        }
        catch(SQLException e) {
            System.err.println(e);
            return null;
        }
    }
}
