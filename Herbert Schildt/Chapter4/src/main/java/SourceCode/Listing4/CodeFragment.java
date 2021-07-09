/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SourceCode.Listing4;

/**
 *
 * @author pc
 */
public class CodeFragment {

    public static void main(String[] args) {
        UseMeth cf = new UseMeth();
        cf.myMeth();
    }

}

class UseMeth {

    void myMeth() {
        int i;

        for (i = 0; i < 10; i++) {
            if (i == 5) {
                return; // stop at 5 
            }
            System.out.println(i);
        }

    }
}
