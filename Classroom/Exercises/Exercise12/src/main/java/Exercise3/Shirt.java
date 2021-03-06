package Exercise3;

public class Shirt extends Item{
    private char size;
    private char colorCode;
    
    public Shirt(double price, char size, char colorCode){
        super ("Shirt", price);
        this.size = size;
        this.colorCode = colorCode;
    }
    
    public void display(){
        super.display();
        System.out.println("\tSize: "+size);
        System.out.println("\tColor Code: "+ colorCode);
    } 
    
    // Code a public getColor method that converts the colorCode to a the color name
       // Use a switch statement.  Return the color name. 
    public String GetColour(){
        String colour = "";
        switch(colorCode){
            case 'R':
                colour = "Red";
                break;
            case 'G':
                colour = "Green";
                break;
            case 'B':
                colour = "Blue";
                break;
            default:
                colour = "Invalid Code";
        }
        return colour;
    }
}
