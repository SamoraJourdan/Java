package Exercises;

public class TeenNumberChecker {
    public static boolean hasTeen(int a, int b, int c){
        return ((13 <= a && a <= 19)||
                (13 <= b && b <= 19)||
                (13 <= c && c <= 19));
    }
    public static boolean isTeen(int a){
        return (13 <= a && a <= 19);
    }
}
