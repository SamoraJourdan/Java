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
public class Item {
    String desc;
    int quantity;
    double price;
    char colourCode = 'U';
    
    public void displayItem() {
        System.out.println("Item: " + desc + ", " + quantity + ", "
                + price + ", "+colourCode);
    }
    
    public void setItemFields(String desc, int quantity, double price){
        this.desc = desc;
        this.quantity = quantity;
        this.price = price;
    }
     public int setItemFields(String desc, int quantity, double price, char colourCode){
        if(colourCode != ' '){
            this.colourCode = colourCode;
            this.setItemFields(desc, quantity, price);
            return 1;
        }else{
            return -1;
        }
    }
    
}
