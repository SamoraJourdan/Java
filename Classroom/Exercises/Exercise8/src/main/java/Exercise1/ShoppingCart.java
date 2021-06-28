/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise1;


/**
 *
 * @author pc
 */
public class ShoppingCart {
    public static void main(String[] args) {
        Item item1 = new Item();
        
        if(item1.setColour('B')){
            System.out.println("Item colour: " + item1.color);
        }else{
            System.out.println("Invalid colour code!");
        }
        if(item1.setColour(' ')){
            System.out.println("Item colour: " + item1.color);
        }else{
            System.out.println("Invalid colour code!");
        }
    }    
}
