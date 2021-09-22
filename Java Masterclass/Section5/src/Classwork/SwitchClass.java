package Classwork;

public class SwitchClass {
    public static void main(String[] args) {
        int value = 3;
        int switchValue = 1;

        switch(switchValue){
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value is 3/4/5");
                break;
            default:
                System.out.println("Not 1/2/3/4/5");
        }

        char letter = 'Z';

        switch (letter) {

            case 'A':
                System.out.println("Letter is A");
                break;
            case 'B':
                System.out.println("Letter is B");
                break;
            case 'C':
                System.out.println("Letter is C");
                break;
            case 'D':
                System.out.println("Letter is D");
                break;
            case 'E':
                System.out.println("Letter is E");
                break;

            default:
                System.out.println("Letter is not A,B,C,D or E");
        }

    }
}
