package Exercises;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {

        int num11 = (int)(num1 * 1000);
        int num22 = (int)(num2 * 1000);

        if(num11 == num22){
            return true;
        }
        return false;

    }

}

