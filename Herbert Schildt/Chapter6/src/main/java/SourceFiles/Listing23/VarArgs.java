/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SourceFiles.Listing23;

/**
 *
 * @author pc
 */
// Demonstrate variable-length arguments. 
class VarArgs { 
 
  // vaTest() uses a vararg. 
  static void vaTest(int ... v) { 
    System.out.println("Number of args: " + v.length); 
    System.out.println("Contents: "); 
 
    for(int i=0; i < v.length; i++) 
      System.out.println("  arg " + i + ": " + v[i]); 
 
    System.out.println(); 
  } 
 
  public static void main(String args[])  
  { 
 

    vaTest(10);      // 1 arg 
    vaTest(1, 2, 3); // 3 args 
    vaTest();        // no args 
  } 
}
