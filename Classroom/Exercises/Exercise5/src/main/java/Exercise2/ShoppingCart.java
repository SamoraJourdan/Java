/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;


/**
 *
 * @author pc
 */
public class ShoppingCart {
    public static void main(String[] args) {
        String custName = "Mary Smith";
        String message = custName + " wants to purchase a several items.";
        String[] items = {"Black Lotus", "Gaeas Cradle", "Cabal Coffers", "Ashanods Altar"}; 
        
       
        message = custName + " would like to buy " + items.length + " items."; 
        System.out.println(message);
        System.out.println(items[3]);
    }
}
