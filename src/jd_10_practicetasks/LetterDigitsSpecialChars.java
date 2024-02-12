package jd_10_practicetasks;

import java.util.Arrays;

public class LetterDigitsSpecialChars {
    public static void main(String[] args) {
        String str = "Wooden spoon123!";
        String isLetter ="";
        String isDigit ="";
        String isSpecialChar ="";

        char [] x = str.toCharArray();
        for (char c : x) {
            if ((Character.isDigit(c))){
                isDigit +=c;
            } else if ((Character.isLetter(c))) {
                isLetter +=c;
            }else {
                isSpecialChar +=c;
            }
        }
        System.out.println("isLetter = " + isLetter);
        System.out.println("isDigit = " + isDigit);
        System.out.println("isSpecialChar = " + isSpecialChar);
    }
}
