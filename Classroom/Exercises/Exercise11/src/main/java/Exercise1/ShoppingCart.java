package Exercise1;

// import statements here:

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class ShoppingCart {
    public static void main(String[] args){
	// Declare a LocalDateTime object, orderDate
        LocalDateTime orderDate;
        
	// Initialize the orderDate to the current date and time. Print it.
        orderDate = LocalDateTime.now();
        System.out.println(orderDate);

	// Format orderDate using ISO_LOCAL_DATE; Print it.
        String isoDate = orderDate.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(isoDate);
        
    }
}