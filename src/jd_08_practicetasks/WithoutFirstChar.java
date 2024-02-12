package jd_08_practicetasks;

import java.util.Scanner;

public class WithoutFirstChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first word");
        String firstWord = input.next();

        System.out.println("Enter your second word");
        String secondWord = input.next();
        System.out.println(firstWord.substring(1).concat(secondWord.substring(1)));


        input.close();

    }
}
