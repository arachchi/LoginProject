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
public class ProductOfficeStationeries extends tabProxy{
        private ArrayList<Product> list;
    private Product next;
    private int size,access;
    public ProductOfficeStationeries(){
        list=new ArrayList();
        access=-1;
    }

    @Override
    public Product getNextProduct() {
        if(access<size-1){
            access++;
        return list.get(access);
        }
        else return null;//if no items
       
    }
    public void updateTheProxy(){
    //update the list
        size=list.size();
        
    }
        public void set(Product temp){
        list.add(temp);
    }
            public void update(  javax.swing.JTable jTable){
        Product temp;
         for(int i=0;i<list.size();i++){
             access++;
             temp=list.get(access);
             System.out.println(temp.getName());
             jTable.setValueAt(temp.getName(), i, 1);
             jTable.setValueAt(temp.getAmount(), i, 2);
         }
    }
    
}
