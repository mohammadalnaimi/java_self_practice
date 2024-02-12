package jd_08_practicetasks;
/*
 Create a class named CombineWords. Ask the user to enter two words. Then, add them together and print. But if the
last letter of the first word and the first letter of the second word are the same, print that character once.

        Example:
              Input:
                 one
                 eight

              Output:
                   oneight
 */

import java.util.Scanner;
public class CombineWords {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first word");
        String firstWord = input.next();

        System.out.println("Enter your second word");
        String secondWord = input.next();
        input.close();

        String result = (firstWord.length()-1 == secondWord.charAt(0))
                ?firstWord.substring(firstWord.length()-1).concat(secondWord.substring(0))
                :firstWord.concat(secondWord);

        System.out.println(result);

    }
}
