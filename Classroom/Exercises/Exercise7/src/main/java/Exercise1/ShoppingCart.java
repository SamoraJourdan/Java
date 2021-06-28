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
        String custName = "Steve Smith"; 
        String firstName;
        int spaceIdx;

        spaceIdx = custName.indexOf(" ");
        firstName = custName.substring(0, spaceIdx);
        System.out.println(firstName);
        
    }
}
