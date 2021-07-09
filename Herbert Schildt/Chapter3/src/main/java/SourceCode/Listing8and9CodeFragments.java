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
public class Listing8and9CodeFragments {

    public static void main(String[] args) {
        int i = 3;
        switch (i) {
            case 1:
            case 2:
            case 3:
                System.out.println("i is 1, 2 or 3");
                break;
            case 4:
                System.out.println("i is 4");
                break;
        }
        char ch1 = 'A';
        char ch2 = ch1;
        switch (ch1) {
            case 'A':
                System.out.println("This A is part of outer switch.");
                switch (ch2) {
                    case 'A':
                        System.out.println("This A is part of inner switch");
                        break;
                    case 'B': 
                        System.out.println("Wont Print");
                } // end of inner switch 
                break;
            case 'B': 
                System.out.println("Wont Print");
        }
    }
}
