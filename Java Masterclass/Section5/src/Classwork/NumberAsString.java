package Classwork;

public class NumberAsString {
    public static void main(String[] args) {
        String numAsString = "2018.125";
        System.out.println("number as String: " + numAsString);

        double number = Double.parseDouble(numAsString);
        System.out.println("number: " + number);

        numAsString += 1;
        number += 1;

        System.out.println("number as String: " + numAsString);
        System.out.println("number: " + number);
    }
}
