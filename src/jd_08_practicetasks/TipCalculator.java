package jd_08_practicetasks;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter split or No split (Yes or No),");
        String splitOrNotSplit = input.nextLine();
        System.out.println("Enter the number of people ");
        int amountOfPeople = input.nextInt();
        System.out.println("Enter the check amount ");
        double checkAmount = input.nextDouble();
        input.nextLine();
        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String quality = input.nextLine();
        input.close();

        System.out.println("Number of people entered: "+amountOfPeople);
        System.out.println("Total to pay: "+(checkAmount+tip(quality,checkAmount)));
        System.out.println("Total tip: "+tip(quality,checkAmount));
        System.out.println("Total per person: " + (checkAmount+tip(quality,checkAmount))/amountOfPeople);
        System.out.println("Tip per person: "+tip(quality,checkAmount)/amountOfPeople);


    }


    public static double tip(String quality,double checkAmount){
        double tip = 0;
        if (quality.equalsIgnoreCase("Excellent")){
            tip = checkAmount*0.25;
        } else if (quality.equalsIgnoreCase("great")) {
            tip = checkAmount*0.20;
        } else if (quality.equalsIgnoreCase("good")) {
            tip = checkAmount*0.15;
        } else if (quality.equalsIgnoreCase("fair")) {
            tip = checkAmount * 0.10;
        } else if (quality.equalsIgnoreCase("poor")) {
            tip = checkAmount*0.5;
        }
        return tip;


    }
}
