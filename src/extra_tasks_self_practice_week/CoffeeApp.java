package extra_tasks_self_practice_week;

import java.util.Scanner;

import static extra_tasks_self_practice_week.Coffee.CoffeeChoice;
import static extra_tasks_self_practice_week.Coffee.Order;

public class CoffeeApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Coffee Order App!\n\t Would you like to order coffee ?(YES / NO)");

        String answer = input.next().toLowerCase();
        while ( !(answer.equals("yes") || answer.equals("no"))){
            System.out.println("Invalid entry please re-enter (Yes Or NO)");
            answer = input.next().toLowerCase();
        }

        if (answer.equals("no")){
            System.out.println("Thanks for using our service!");
            System.exit(1);
        }



         answer = "yes";
        double total = 0;
        while (answer.equals("yes")) {
            total += CoffeeChoice();
            System.out.println("Would you like another order ?");
            answer = Order();
        }

       if (answer.equals("no")){
           System.out.println("Your total is: $"+total);
       }
input.close();
    }
}
