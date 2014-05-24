/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atlas.login;

import java.security.MessageDigest;
import java.util.Arrays;

/**
 *
 * @author Nuran Arachchi
 */
public class PasswordMatch {
 public static String getHash(String password) throws Exception {
        MessageDigest sha256=MessageDigest.getInstance("SHA-256");
        byte[] passBytes=password.getBytes();
        byte[] passHash=sha256.digest(passBytes);
        String hash=Arrays.toString(passHash);
        return hash;
    }
    
     public static boolean compareData(Customer user,String password) throws Exception// returns true if username and password is a match
    {
        if(user.getPassword().equals(password))
            return true;
        else
            return false;
    }
    
     public static boolean changePassword(Customer user,String curPassword,String newPassword) throws Exception
    {
        if(compareData(user,curPassword))
        {
            user.setPassword(newPassword);
            return true;
        }
        else
            return false;
    }
    
}
