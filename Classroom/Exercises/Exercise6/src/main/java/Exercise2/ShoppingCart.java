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
        Item lotus = new Item();
        lotus.descr = "Black Lotus";
        Item coffers = new Item();
        coffers.descr = "Cabal Coffers";
        System.out.println("Card one is: " + lotus.descr);
        System.out.println("Card two is: " + coffers.descr);
        
    }
}
