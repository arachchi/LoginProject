/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atlas.login;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Nuran Arachchi
 */
public class CustomerProxy implements TableProxy{
     private Connection connection;
    private String tableName="customerinfo";
    private Statement stmt=null;
    
    private static CustomerProxy instance=null;
    
    private CustomerProxy()
    {
        connection=DatabaseConnection.getDatabaseConnection().getConnection();  //retrieves the connection to the database from singleton DatabaseConnection object
        
    }
    
    public static CustomerProxy getCustomerProxy()
    {
        if(instance==null)
        {
            instance=new CustomerProxy();
            return instance;
        }
        else
            return instance;
    }

    @Override
    public Object get(String ID) {
        Customer user=new Customer();
         try {
             //create database connection and all things
             
             stmt=connection.createStatement();
             ResultSet result=stmt.executeQuery("SELECT * from "+tableName+" where email='"+ID+"'");
             if(result.next())
            // System.out.println(result.getString(2));
             user.setPassword(result.getString("password"));
             user.setCustomerId(result.getString("customerID"));
             user.setFirstName(result.getString("FirstName"));
             user.setLastName(result.getString("LastName"));
             user.setAddress(result.getString("address"));
             user.setMobileNo(result.getString("mobileNo"));
             user.setEmail(result.getString("email"));
             
             
         } catch (SQLException ex) {
             Logger.getLogger(CustomerProxy.class.getName()).log(Level.SEVERE, null, ex);
         }
         return user;
    }

    @Override
    public boolean add(Object obj) {
        Customer user=(Customer)obj;
        try{
        stmt=connection.createStatement();
           // System.out.println(user.getPassword());
        stmt.executeUpdate("INSERT INTO atlasproject."+tableName+" (email,password,customerID,FirstName,LastName) VALUES ('"+user.getEmail()+"', '"+user.getPassword()+"', '"+user.getCustomerId()+"', '"+user.getFirstName()+"', '"+user.getLastName()+"') "+""); 
        
         //   System.out.println(tableName);
            return true;
        }catch(Exception e){
            System.out.println("Error created");
            e.printStackTrace();
        }
        return false;
    }
        public boolean update(Object obj) {
        Customer user=(Customer)obj;
        try{
        stmt=connection.createStatement();
           // System.out.println(user.getPassword());
        stmt.executeUpdate("UPDATE "+tableName+" SET mobileNo='"+user.getMobileNo()+"'"+" , address='"+user.getAddress()+"'"+" ,FirstName= '"+user.getFirstName()+"'"+" ,LastName='"+user.getLastName()+"' where email='"+user.getEmail()+"'");
         //   System.out.println(tableName);
            return true;
        }catch(Exception e){
            System.out.println("Error created");
            e.printStackTrace();
        }
        return false;
    }


}
