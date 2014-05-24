/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atlas.login;

import java.util.ArrayList;

/**
 *
 * @author Nuran Arachchi
 */
public class NewOrder extends Order{
    ArrayList<ProductValProxy> list;
    static int no=-1;
    
    public NewOrder(){
        list=new ArrayList();
        
    }
    public void addItem(String productName,int quantity){
        ProductValProxy temp=new ProductValProxy();
        temp.setProductName(productName);
        temp.setQuantity(date);
        
        list.add(temp);
        
    }
    public ProductValProxy getProxy(){
        no++;
        if(no<list.size())
            return list.get(no);
        else return null;
   
    }
    public void removeItem(){
    
    }
    public void cancelOrder(){
    
    }
}
