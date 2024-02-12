package jd04_selection_statement_practice_tasks;

public class NumberOfDays {
    public static void main(String[] args) {
        int month = 10;
        switch (month){
            case 1,3,5,7,8,10,12 -> System.out.println("31 days");
            case 2 -> System.out.println("28 days");
            case 4,6,9,11 -> System.out.println("30 days");
            default -> System.out.println("Invalid");
        }
    }
}
