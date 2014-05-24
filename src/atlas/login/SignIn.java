/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atlas.login;

/**
 *
 * @author Nuran Arachchi
 */
public class SignIn {
    public boolean login(String userName, String password){
        //if userName password correct      return true                  else             return false
        CustomerProxy proxy=CustomerProxy.getCustomerProxy();
        Customer user1;       
        user1=(Customer)(proxy.get(userName));
        if(user1.getPassword().equals(password))
            return true;
        else
            return false;
    }
}
