/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atlas.login;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Nuran Arachchi
 */
public class productProxy implements TableProxy{
     private Connection connection;
    private String tableName="finishedmaterialinfo";
    private Statement stmt=null;
    
    private static productProxy instance=null;
    
    private productProxy(){
        connection=DatabaseConnection.getDatabaseConnection().getConnection();
    }
    public static productProxy getProductProxy(){
        if(instance==null)
        {
            instance=new productProxy();
            return instance;
        }
        else
            return instance;
    
    }
    @Override
    public Object get(String ID) {
        Product finished=new Product();
        try{
            stmt=connection.createStatement();
            ResultSet result=stmt.executeQuery("SELECT * from "+tableName+" ");//This product loads every product.. no need of where
             if(result.next()){
                finished.setCategory(result.getString("Category"));
                 System.out.println(finished.getCategory());
                 
             }
            
        
        }catch(Exception e){
        
        }
        
        return finished;
    }
    public ResultSet getResult(){
             
        try{
            stmt=connection.createStatement();
            ResultSet result=stmt.executeQuery("SELECT * from "+tableName+" ");//This product loads every product.. no need of where
            return result;        
        }catch(Exception e){
        
        } 
        return null;
    }

    @Override
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
