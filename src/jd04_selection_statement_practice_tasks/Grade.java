package jd04_selection_statement_practice_tasks;

public class Grade {
    public static void main(String[] args) {
        char garde = 'A';

        if (garde =='A'){
            System.out.println("Excellent");
        } else if (garde == 'B') {
            System.out.println("Great job");
        } else if (garde == 'C') {
            System.out.println("Good");
        } else if (garde == 'D') {
            System.out.println("Passed");
        } else if (garde == 'F') {
            System.out.println("Failed");
        }else {
            System.out.println("Invalid Grade");
        }

    }
}