package Exercise4;

import java.util.ArrayList;

public class ShoppingCart {
    public static void main(String[] args){   
        // Declare, instantiate, and initialize an ArrayList of Strings.  Print and test your code.
        ArrayList<String> arLi = new ArrayList();
        arLi.add("Black Lotus");
        arLi.add("Gaeas Cradle");
        arLi.add("Ashanods Altar");
        arLi.add("Cabal Coffers");
        
        // add (insert) another element at a specific index
        arLi.add("Wrens Run Vanquisher");

	// Check for the existence of a specific String element.  
        //   If it exists, remove it.
        if (arLi.contains("Cabal Coffers")){
            arLi.remove("Cabal Coffers");
        }
        System.out.println(arLi);
            
    }
}
