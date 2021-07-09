/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SourceFiles;

/**
 *
 * @author pc
 */
// Objects are passed through their references. 

 
class PassObjRef { 
  public static void main(String args[]) { 
    Test2 ob = new Test2(15, 20); 
    Test2 ob2 = new Test2(17, 23);
    
    System.out.println("ob.a and ob.b before call: " + 
                       ob.a + " " + ob.b); 
 
    ob2.change(ob2); 
 
    System.out.println("ob.a and ob.b after call: " + 
                       ob.a + " " + ob.b); 
    System.out.println("ob.a and ob.b after call: " + 
                       ob2.a + " " + ob2.b); 
  } 
}