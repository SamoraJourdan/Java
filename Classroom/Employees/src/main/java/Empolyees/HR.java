/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empolyees;

/**
 *
 * @author pc
 */
public class HR extends Employees {
    private int complaintsProcessed;
    
    public HR(int empID, double salary, boolean hasBeenPaidThisMonth,int complaintsProcessed){
        this(empID,"HR", salary, hasBeenPaidThisMonth, complaintsProcessed);
        
        
    }
    public HR(int empID, String dept, double salary, boolean hasBeenPaidThisMonth, int complaintsProcessed){
        super(empID, dept , salary, hasBeenPaidThisMonth);
        this.complaintsProcessed = complaintsProcessed;

                           
    }
    @Override
    public void display(){
         System.out.println("Employee ID: " + this.getEmpId()); 
         System.out.println("Department: " + this.getDept());
         System.out.println("Salary: " + this.getSalary());
         System.out.println("Has been paid for this month: " + this.isHasBeenPaidThisMonth());
         System.out.println("Has processed " + this.complaintsProcessed + " this month");
    }
}
