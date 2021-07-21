/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5;

/**
 *
 * @author pc
 */
public class Average {
    public static void main(String[] args) {

        double nums[] ={1,2,3,4,5,6,7,8,9,10};
        double total = 0.0;
        for (double num:nums){
            total += num;
        }
        System.out.println("Average is " + total/nums.length);
    }
}
