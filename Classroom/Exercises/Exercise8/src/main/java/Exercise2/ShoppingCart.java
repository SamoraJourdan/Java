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
        Item item1 = new Item();

        item1.setItemFields("Cabal Coffers", 1, 200);
        item1.displayItem();
        if ((item1.setItemFields("Cabal Coffers", 1, 200, ' ')) < 0) {
            System.out.println("Invalid Colour Code!");
        } else {
            item1.displayItem();
        }
    }

}
