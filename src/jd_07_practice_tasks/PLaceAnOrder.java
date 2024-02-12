package jd_07_practice_tasks;

import java.util.Scanner;

public class PLaceAnOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the product name ");
        String productName = input.nextLine();

        System.out.println("Enter the price");
        double price = input.nextDouble();

        System.out.println("Enter the quantity");
        int quantity = input.nextInt();

        System.out.println("Enter your first name");
        String name = input.next();

        input.close();
        double total= quantity*price;
        System.out.println(name+", your order for "+quantity+" "+productName+" has been placed. Your total is "+total+".");

    }
}
