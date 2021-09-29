package Exercises;

public class LargestPrime {
    public static int getLargestPrime(int num){
        int largest = 0;
        for(int i = 0; i <= num/2; i++){
            if(num%i == 0){
                for(int m = 2; m <= i/2; m++){
                    if(i%m != 0){
                        largest = m;
                    }
                }
            }
        }
        return largest;
    }
}
