/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SourceCode.Listing12;


/**
 *
 * @author pc
 */
public interface Series { 
  int getNext(); // return next number in series 
  void reset(); // restart 
  void setStart(int x); // set starting value 
}
