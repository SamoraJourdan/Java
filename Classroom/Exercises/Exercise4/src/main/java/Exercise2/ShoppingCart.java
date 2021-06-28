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
        String custName = "Sam Jourdan";
        String itemDesc = "Black Lotus";
        double price = 100_000.00;
        double tax = 1.14;
        int quantity = 2;
        double total;
        
        String message = custName + " would like to purchase " + quantity + " " + itemDesc + ".";     
        System.out.println(message); 
        total = price*quantity*tax;
        System.out.println("Total cost with tax is: R" + total);
    }
}
