package extra_tasks_self_practice_week;

import java.util.Scanner;

public class ATMSimulation {
    public static void main(String[] args) {
        double accountBalance = 2550.5;
        PinNumber();
        Scanner input = new Scanner(System.in);
        System.out.println("Please select from one of the three following options:\n1-Check Balance:\n2-Deposit Money:\n3-Withdraw Money:");
        String selection = input.nextLine();
        Service(selection);

        if (selection.equalsIgnoreCase("Check Balance"))
            System.out.println("The availabe balance is: " + accountBalance);

        if (selection.equalsIgnoreCase("Deposit Money")) {
            System.out.println("Please enter the amount: ");
            int depoistAmount = input.nextInt();
            if (depoistAmount <= 0) {
                System.err.println("Depositing amount cannot be zero or negative, please try again later.");
                System.exit(1);
            } else {
                System.out.println("New available balance is: " + (depoistAmount + accountBalance));
            }
        }

        if (selection.equalsIgnoreCase("Withdraw Money")) {
            System.out.println("Please enter withdraw amount");
            int withdrawAmount = input.nextInt();
            if (withdrawAmount <= 0) {
                System.err.println("Cannot withdraw zero or negative amount, please try again later.");
                System.exit(1);
            } else if (withdrawAmount > accountBalance) {
                System.err.println("Insufficient funds. Withdrawal failed.");
                System.exit(1);
            } else {
                System.out.println("New available balance " + (accountBalance - withdrawAmount));
            }
        }
        input.close();
    }

    public static void PinNumber() {
        int pinNumber = 2546;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your pin number ");
        int userPinNum = input.nextInt();
        if (userPinNum != pinNumber) {
            for (int i = 0; i < 2; i++) {
                System.out.println("Incorrect Pin Number, Please re-enter:");
                userPinNum = input.nextInt();
                if (userPinNum == pinNumber) {
                    break;
                } else {
                    continue;
                }
            }
            if (userPinNum != pinNumber) {
                System.err.println("Your card is locked. Please contact with your local bank");
                System.exit(1);
            }
        }
        return;

    }

    public static void Service(String selection) {
        if (selection.equalsIgnoreCase("check balance")
                || selection.equalsIgnoreCase("deposit money")
                || selection.equalsIgnoreCase("withdraw money")) {
            return;
        } else {
            System.err.println("Invalid choice. Exiting the ATM. Thank you for using our services!");
            System.exit(1);
        }

    }
}
