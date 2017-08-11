/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Hashan
 */
public class DBConnect {
    private static final String DB_HOST = "jdbc:mysql://localhost:3306/javalms";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
    
    public static Connection getConnection(){
        Connection conn = null;
        
        try{
            conn = DriverManager.getConnection(DB_HOST,USERNAME,PASSWORD);
            System.out.println("connected");
        } catch(SQLException e){
            System.err.println("error: "+e);
        }    
        return conn;
    }
    
}
