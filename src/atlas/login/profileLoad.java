/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atlas.login;

/**
 *
 * @author Nuran Arachchi
 */
public class profileLoad {
    private String name;
    private String customerId;
    private String email;
    private String mobileNo;
    private String address;
    private String username;
    private String password;
    
    public void getUpdate(){
        //variables will be updated using the database
    }
        public void updateTheDatabase(){
        //update the dataBase using new values if the password matches the previous one
    }
    public String getName(){
        return name;
    }
    public String getCustomerId(){
        return customerId;
    }
    public String getEmail(){
        return email;
    }
    public String getmobileNo(){
        return mobileNo;
    }
    public String getAddress(){
        return address;
    }
    public String getUserName(){
        return username;
    }
    public String getPassword(){
        return password;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @param mobileNo the mobileNo to set
     */
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
