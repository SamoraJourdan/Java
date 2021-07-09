/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SourceCode;

/**
 *
 * @author pc
 */
public class Listing13CodeFragment {

    public static void main(String[] args) {
        int count;
        int x = 0;
        for (count = 10; count < 5; count++) {
            x += count; // this statement will not execute
        }
    }
}
