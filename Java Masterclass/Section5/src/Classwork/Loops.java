package Classwork;

public class Loops {
    public static void main(String[] args) {
        for(int i=2; i<9; i++){
            System.out.println("10000 at " + i + "% interest = " + String.format("%.2f", calcInterest(10000, i)));
        }
        System.out.println("***************");
        for(int i=8; i>1 ; i--){
            System.out.println("10000 at " + i + "% interest = " + String.format("%.2f", calcInterest(10000, i)));
        }
        System.out.println("***************");
        int count = 0;
        for(int i = 20; i <= 100; i++){
            if(isPrime(i)) {
                System.out.println(i + " is a prime number.");
                count++;
                if (count >= 3) {
                    System.out.println("Exiting For Loop");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2; i <= (long) Math.sqrt(n); i++){
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calcInterest(double amount, double rate){
        return (amount*(rate/100));
    }
}
