/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter1;

/**
 *
 * @author pc
 */
public class InchToMeter {
   public static void main(String args[]) {  
    double inch, meters; 
    int counter; 
 
    counter = 0; 
    for(inch = 1; inch <= 144; inch++) { 
      meters = inch * 39.37; 
      System.out.println(inch + " inches is " + 
                         meters + " meters."); 
 
      counter++;       
      if(counter == 12) { 
        System.out.println(); 
        counter = 0;  
      } 
    } 
  }   
}
