package Exercise3;

public class ShoppingCart {
    public static void main(String[] args) {
         // declare and instantiate a Shirt object using an Item reference type
        Item shirt1 = new Shirt(10, 'M', 'R');
        
        // call the display method on the object, then the getColor method
        shirt1.display();
        if (shirt1 instanceof Shirt){
            String colour = ((Shirt)shirt1).GetColour();
            System.out.println("Shirt colour is: "+colour);
        }else{
            System.out.println("Item is not a Shirt!");
        }
    }
}
