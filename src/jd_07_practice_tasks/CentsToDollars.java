package jd_07_practice_tasks;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the cents:");
        int cents = input.nextInt();
        input.close();
        int dollars = cents / 100;
        int remain=cents % 100;
        System.out.println(cents+" cents is equal to "+dollars+" and "+remain+" cents");

    }
}
