package Classwork;

import java.util.Scanner;

public class MinMaxInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while(true) {
            System.out.println("Enter Number: ");
            boolean isInt = scanner.hasNextInt();

            if (isInt) {

                int num = scanner.nextInt();
                    if (num > max) {
                        max = num;
                    }
                    if (num < min) {
                        min = num;
                    }
                } else {
                    System.out.println("Min : " + min + " Max: " + max);
                    break;
                }
            }
        scanner.close();
    }
}
