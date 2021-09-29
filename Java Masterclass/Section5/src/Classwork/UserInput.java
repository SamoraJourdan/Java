package Classwork;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt) {
            int yOB = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2021 - yOB;
            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name);
                System.out.println("Your age is " + age);
            } else {
                System.out.println("Invalid year of birth");
            }
        }else{
            System.out.println("Please use only numbers for Year Of Birth");
        }
        scanner.close();

    }
}
