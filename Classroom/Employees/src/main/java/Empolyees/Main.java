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
public class Main {
    public static void main(String[] args) {
        Sales seller1 = new Sales(12, 5000, true, 2000);
        seller1.display();
        HR hrrep1 = new HR(55, 10000, false, 13);
        hrrep1.display();
    }
}
