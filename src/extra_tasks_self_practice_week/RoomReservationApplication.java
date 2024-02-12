package extra_tasks_self_practice_week;

import java.util.Scanner;

public class RoomReservationApplication {
    public static void main(String[] args) {
        System.out.println("Welcome to the Cydeo Skyline Inn!");
        System.out.println("Would you like to reserve a room? (Yes/No)");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine().toLowerCase();
        while (!(answer.equals("yes") || answer.equals("no"))) {
            System.out.println("Invalid entry please re-enter ( yes or no)");
            answer = input.next().toLowerCase();
        }

        if (answer.equals("no")) {
            System.out.println("\"You have a wonderful day!\"");
            input.close();
            return;
        }


        System.out.println("Please enter your first name:");
        String firstName = input.next();
        System.out.println("Please enter your last name:");
        String lastName = input.next();
        System.out.println("Please enter your age:");
        int age = input.nextInt();
        System.out.println("Room types and prices:");
        System.out.println("\t\t\t\t\t\t\t\t\tKing Bed   ===== $160\n" +
                "\t\t\t\t\t\t\t\t\t Queen Bed  ===== $120\n" +
                "\t\t\t\t\t\t\t\t\t Single Bed ===== $100");




        System.out.println("Which room would you like to reserve? (King/Queen/Single)");
        String roomSize = input.next().toLowerCase();

        while (!(roomSize.equals("king") || roomSize.equals("queen") || roomSize.equals("single"))) {
            System.err.println("Invalid entry, you must enter: (King or Queen or Single)");
            roomSize = input.next().toLowerCase();
        }
        System.out.println("How many nights would you like to stay?");
        int nightsCount = input.nextInt();
        while (nightsCount <= 0 && nightsCount > 365) {
            System.err.println("Invalid number, number of nights must be bigger than 0 and less than 365 please re-enter");
            nightsCount = input.nextInt();
        }

        System.out.println("Are you a veteran? (Yes/No)");
        String vetern = input.next().toLowerCase();
        while (!(vetern.equals("yes") || vetern.equals("no"))) {
            System.out.println("Invalid entey please re-enter ( yes or no)");
            vetern = input.next();
        }


       int roomCost = (roomSize.equals("king")) ? 160 : (roomSize.equals("queen")) ? 120 : 100;

        double roomFee = roomCost * nightsCount;
        double taxRate = roomFee * 0.08;
        double grandTotal = roomFee + taxRate;

        if (age >= 64 && vetern.equals("yes")) {
            grandTotal = grandTotal - (grandTotal * 0.25);
            System.out.println("Hello " + firstName + ", You have selected " + roomSize + " Bed for " + nightsCount + " nights to stay.\n" +
                    "\t\t\t\t\t\tRoom fee: $" + roomFee +
                    "\t\t\t\t\t\tTax is: $" + taxRate +
                    "\n" +
                    "\t\t\t\t\t\tYour grand total is: $" + grandTotal);
        } else if (age >= 64) {
            grandTotal = grandTotal - (grandTotal * 0.10);
            System.out.println("Hello " + firstName + ", You have selected " + roomSize + " Bed for " + nightsCount + " nights to stay.\n" +
                    "\t\t\t\t\t\tRoom fee: $" + roomFee +
                    "\t\t\t\t\t\tTax is: $" + taxRate +
                    "\n" +
                    "\t\t\t\t\t\tYour grand total is: $" + grandTotal);
        } else if (vetern.equals("yes")) {
            grandTotal = grandTotal - (grandTotal * 0.15);
            System.out.println("Hello " + firstName + ", You have selected " + roomSize + " Bed for " + nightsCount + " nights to stay.\n" +
                    "\t\t\t\t\t\tRoom fee: $" + roomFee +
                    "\t\t\t\t\t\tTax is: $" + taxRate +
                    "\n" +
                    "\t\t\t\t\t\tYour grand total is: $" + grandTotal);
        } else {
            System.out.println("Hello " + firstName + ", You have selected " + roomSize + " Bed for " + nightsCount + " nights to stay.\n" +
                    "\t\t\t\t\t\tRoom fee: $" + roomFee +
                    "\t\t\t\t\t\tTax is: $" + taxRate +
                    "\n" +
                    "\t\t\t\t\t\tYour grand total is: $" + grandTotal);
        }

        input.close();
    }
}
