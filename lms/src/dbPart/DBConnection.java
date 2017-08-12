package dbPart;

import java.sql.*;
import java.sql.Statement;

public class DBConnection {
        
    public static Connection ConnectDB()
    {
       Connection conn = null;
       Statement stmt = null;
       
       try{
           
           //JDBC driver
           Class.forName("com.mysql.jdbc.Driver");
           
           //Connection
           conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/lmsview","root","");
           //Trying to establish the connection, Not connect yet
           // DB properties are incude here
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
       return conn;
   }
    
    
}
