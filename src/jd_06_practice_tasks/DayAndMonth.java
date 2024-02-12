package jd_06_practice_tasks;

public class DayAndMonth {

    public static void main(String[] args) {
        int day = day(2);
        int month = monthName(6);
        int daysInMonth = daysInMonth(12);
    }

    public static int day(int a) {
        switch (a) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid Num");
        }
        return a;
    }

    public static int monthName(int a) {
        switch (a) {
            case 1 -> System.out.print("January");
            case 2 -> System.out.print("February");
            case 3 -> System.out.print("March");
            case 4 -> System.out.print("April");
            case 5 -> System.out.print("May");
            case 6 -> System.out.print("June");
            case 7 -> System.out.print("July");
            case 8 -> System.out.print("August");
            case 9 -> System.out.print("September");
            case 10 -> System.out.print("October");
            case 11 -> System.out.print("November");
            case 12 -> System.out.print("December");
            default -> System.out.print("Invalid Num");
        }
        return a;
    }

    public static int daysInMonth(int a) {
        System.out.println();
        switch (a) {
            case 1, 3, 5, 7, 8, 10, 12:
                monthName(a);
                System.out.println(" has 31 days");
                break;
            case 2, 4, 6, 9, 11:
                monthName(a);
                System.out.println(" has 30 days");
                break;
            default:
                monthName(a);
                System.out.println("Invalid num");
        }
        return a;

    }
}
