package jd_07_practice_tasks;

import java.util.Scanner;

public class FamilyMember {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many people do you live with?");
        int num = input.nextInt();
        input.close();
        if (num >= 0 && num < 20){
            if (num < 3){
                System.out.println("Live with less than three people.");
            } else if (num < 7) {
                System.out.println("Live with 3 - 6 people.");
            }else {
                System.out.println("Live with more than six people.");
            }

        }else {
            System.err.println("Invalid number ");
        }


    }
}
