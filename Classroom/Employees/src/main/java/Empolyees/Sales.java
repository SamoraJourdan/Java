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
public class Sales extends Employees {
    private double sales;
    
    public Sales(int empID, double salary, boolean hasBeenPaidThisMonth, double sales){
        this(empID,"Sales", salary, hasBeenPaidThisMonth, sales);
        
        
    }
    public Sales(int empID, String dept, double salary, boolean hasBeenPaidThisMonth, double sales){
        super(empID, dept, salary, hasBeenPaidThisMonth);
        this.sales = sales;
    }

   @Override
   public void display(){
         System.out.println("Employee ID: " + this.getEmpId()); 
         System.out.println("Department: " + this.getDept());
         System.out.println("Salary: " + this.getSalary());
         System.out.println("Has been paid for this month: " + this.isHasBeenPaidThisMonth());
         System.out.println("Has made R" + this.sales + " in sales this month");
    }
    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }
    
}

