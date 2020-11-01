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
    public Connection createConnection() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Mini_Project?user=root&password=Ishanika167");
            return conn;
        }
        catch(SQLException e) {
            System.err.println(e);
            return null;
        }
    }
}
