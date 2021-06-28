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
public class Item {
    char color;
    
    public boolean setColour(char colourCode){
        if (colourCode == ' '){
            return false;
        }else{
            this.color = colourCode;
            return true;
        }
    }
}
   