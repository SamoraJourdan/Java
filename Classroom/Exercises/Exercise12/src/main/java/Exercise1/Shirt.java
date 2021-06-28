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
public class Shirt extends Item{
    private char size;
    private char colourCode;
    
    public Shirt(double price, char colourCode, char size){
        super("Shirt", price);
        this.colourCode = colourCode;
        this.size = size;
    }
}
