/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SourceCode.Listing11;

/**
 *
 * @author pc
 */
// Using the Throwable methods.  
 
class ExcTest { 
  static void genException() { 
    int nums[] = new int[4];  
 
    System.out.println("Before exception is generated."); 
 
    // generanums[7] = 10;  te an index out-of-bounds exception  
    nums[7] = 10;  
    System.out.println("this won't be displayed");  
  } 
}     