package Exercises;

public class NumberToWords {
    public static void numberToWords(int number){
        if(number<0){
            System.out.println("Invalid Value");
        }else{
            int num = 0;
            while (number >0) {
                int digit = number % 10;


                number /= 10;
            }
        }
    }
}
