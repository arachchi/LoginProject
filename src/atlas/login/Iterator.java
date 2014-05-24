/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atlas.login;

/**
 *
 * @author Nuran Arachchi
 */
public class Iterator {
    private tabProxy iterator;
    private Product temp;
    public Iterator(tabProxy iterator){
        this.iterator=iterator;
    }

public Product getNext(){
     return iterator.getNextProduct();
}
   
    
}
