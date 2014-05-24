/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atlas.login;

/**
 *
 * @author Nuran Arachchi
 */
public class SignUp {
    private Customer user=new Customer();
    private static int customerId=0;
    public void insertName(String firstName,String lastName){
        user.setFirstName(firstName);
        user.setLastName(lastName);
    }
    public void setUserNamePassword(String email, String password){
        user.setEmail(email);
        user.setPassword(password);
    }
    public void contactDetails(String address,String mobileNo){
        user.setAddress(address);
        user.setMobileNo(mobileNo);
    }
    public void setCustomer(){
        customerId++;
        user.setCustomerId(""+customerId);
    }
    public void createDatabase(){
        customerId++;  
        CustomerProxy proxy=CustomerProxy.getCustomerProxy();
        proxy.add(user);
        
        //createDatabase for the customer to have the product details
    }
   
}
