package extra_tasks_self_practice_week;

import java.util.Scanner;

public class Coffee {

    public static String Order(){
        Scanner input = new Scanner(System.in);
        String answer = input.next().toLowerCase();
        while ( !(answer.equals("yes") || answer.equals("no"))){
            System.out.println("Invalid entry please re-enter (Yes Or NO)");
            answer = input.next().toLowerCase();
        }
        return answer ;
    }

    public static double CoffeeChoice () {


        double blackCoffeePrice = 2.99;
        double lattePrice = 3.49;
        double cappuccinoPrice = 3.79;
        System.out.println("Please choose number (1 or 2 or 3 ) ");
        Scanner input = new Scanner(System.in);
        System.out.println("Coffee Options:\n1. Black Coffee - $" + blackCoffeePrice + "\n2. Latte - $" + lattePrice + "\n3. Cappuccino - $" + cappuccinoPrice);
        int coffeeChoice = input.nextInt();

        while (!(coffeeChoice == 1 || coffeeChoice == 2 || coffeeChoice == 3)) {
            System.out.println("Invalid number please re-enter (1 Or 2 OR 3)");
            coffeeChoice = input.nextInt();
        }
        if (coffeeChoice == 1) {
            System.out.println("Added Black Coffee to Your Order.");
            return blackCoffeePrice;
        } else if (coffeeChoice == 2) {
            System.out.println("Added Latte to Your Order.");
            return lattePrice;

        } else {
            System.out.println("Added Cappuccino to Your Order.");
            return cappuccinoPrice;
        }


    }
}
