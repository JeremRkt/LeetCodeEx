package org.leet;

import static org.leet.lengthOfLastWord.lastWordLength;
import static org.leet.squareroot.mySqrt;

public class Main {
    public static void main(String[] args) {
//        lengthOfLastWord lastWordLength = new lengthOfLastWord();
//        String s = "Good bye";
//        String test = String.valueOf(lastWordLength(s));
//        System.out.println(test);


//        int x = 25;
//        int result = squareroot.mySqrt(x);
//        System.out.println(result);

        power POwer = new power();
        double x = 2.00000;
        int n = 10;

        // Test the myPow() method
        double expected = 8.0;
        double actual = POwer.myPow(x, n);

        System.out.println(actual);
        System.out.println(expected);

    }
}