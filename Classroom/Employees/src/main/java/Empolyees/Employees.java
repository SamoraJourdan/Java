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
public class Employees {
    private int empId;
    private String dept;
    private double salary;
    private boolean hasBeenPaidThisMonth;   
    
    
    public Employees(int empID, String dept, double salary, boolean hasBeenPaidThisMonth){
        this.empId = empID;
        this.dept = dept;
        this.salary = salary;
        this.hasBeenPaidThisMonth = hasBeenPaidThisMonth;
        
    }
    
     public void display(){
         System.out.println("Employee ID: " + this.getEmpId()); 
         System.out.println("Department: " + this.getDept());
         System.out.println("Salary: " + this.getSalary());
         System.out.println("Has been paid for this month: " + this.isHasBeenPaidThisMonth());
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isHasBeenPaidThisMonth() {
        return hasBeenPaidThisMonth;
    }

    public void setHasBeenPaidThisMonth(boolean hasBeenPaidThisMonth) {
        this.hasBeenPaidThisMonth = hasBeenPaidThisMonth;
    }
    
}
