/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SourceFiles.Listing13;

/**
 *
 * @author pc
 */
class Summation { 
  int sum = 0; 
  
  // Construct from an int. 
  Summation(int num) {  
    for(int i=1; i <= num; i++) 
      sum += i; 
  } 
 
  // Construct from another object. 
  Summation(Summation ob) { 
    sum = ob.sum; 
  } 
} 
