package jd_07_practice_tasks;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score");
        int score = input.nextInt();
        input.close();
        if (score > 0 && score <= 100){
            if (score >= 0 && score < 60){
                System.out.println("Your grade is F");
            } else if (score < 70) {
                System.out.println("Your grade is D");
            } else if (score <80) {
                System.out.println("Your grade is C");
            } else if (score < 90) {
                System.out.println("Your grade is B");
            }else {
                System.out.println("Your grade is A");
            }
        }else {
            System.out.println("Invalid Score");
        }
    }
}
