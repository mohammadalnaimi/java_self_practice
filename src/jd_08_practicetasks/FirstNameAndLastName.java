package jd_08_practicetasks;

import java.util.Scanner;

public class FirstNameAndLastName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you first name");
        String firstName = input.next();

        System.out.println("Enter you Last name");
        String lastName = input.next();
        input.close();

        System.out.print( firstName.toUpperCase().charAt(0)+firstName.substring(1).toLowerCase());
        System.out.println(" "+ lastName.toUpperCase().charAt(0)+lastName.substring(1).toLowerCase());

    }
}
