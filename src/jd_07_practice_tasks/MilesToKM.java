package jd_07_practice_tasks;

import java.util.Scanner;

public class MilesToKM {public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter the miles:");

    double miles = input.nextDouble();

    double kilometers = miles * 1.60934;

    System.out.println(miles + " miles is equal to " + kilometers + " kilometers");

    input.close();

}
}
