/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SourceCode.Listing8;

/* 
   Add a parameterized method that computes the  
   fuel required for a given distince. 
*/ 
 
class Vehicle {  
  int passengers; // number of passengers  
  int fuelcap;    // fuel capacity in gallons 
  int mpg;        // fuel consumption in miles per gallon 
 
  // Return the range. 
  int range() { 
    return mpg * fuelcap; 
  } 
 
  // Compute fuel needed for a given distance. 
  double fuelneeded(int miles) { 
    return (double) miles / mpg; 
  } 
}  
  
class CompFuel {  
  public static void main(String args[]) {  
    Vehicle minivan = new Vehicle();  
    Vehicle sportscar = new Vehicle();  
    double gallons; 
    int dist = 252; 
 
     // assign values to fields in minivan 
    minivan.passengers = 7; 
    minivan.fuelcap = 16; 
    minivan.mpg = 21; 
  
    // assign values to fields in sportscar 
    sportscar.passengers = 2; 
    sportscar.fuelcap = 14; 
    sportscar.mpg = 12; 
 
    gallons = minivan.fuelneeded(dist);  
  
    System.out.println("To go " + dist + " miles minivan needs " + 
                       gallons + " gallons of fuel."); 
     
    gallons = sportscar.fuelneeded(dist);  
  
    System.out.println("To go " + dist + " miles sportscar needs " + 
                       gallons + " gallons of fuel."); 
     
  }  
}