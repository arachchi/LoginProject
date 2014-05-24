/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atlas.login;

import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

/**
 *
 */
/*
 * a singleton class which initializes the connectivity to the database.
 * 
 */
public class DatabaseConnection {
    private String dbURL="jdbc:mysql://localhost:3306/atlasproject";
  //  private String dbURL1="jdbc:mysql://localhost:3306/atlasproject?user=root&password=";
    
    private Connection conn=null;
    
    private static DatabaseConnection instance=null;
    
    private DatabaseConnection()
    {
        createConnection();
    }
         
    public static DatabaseConnection getDatabaseConnection()
    {
        if(instance==null)
        {
            instance=new DatabaseConnection();
            return instance;
        }
        else
            return instance;
        //hkjhsdkfj
    }
    
    private void createConnection()//establishes connection to the database
    {
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn=DriverManager.getConnection(dbURL,"root","");
            
        }
        catch(Exception e)
        {
            System.out.println("Database connection failed ");
            e.printStackTrace();
            System.exit(0);
        }
    }
    
    public Connection getConnection()
    {
        return conn;
    }
    public void shutdown()//shuts down database connection
    {
        try
        {
            if(conn!=null)
            {
                
                DriverManager.getConnection(dbURL+";shutdown=true");
                conn.close();
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}
