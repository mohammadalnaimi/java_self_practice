package jd04_selection_statement_practice_tasks;

public class CrewAndPassanger {
    public static void main(String[] args) {
        int total = 122 ;
        if (total == 50){
            System.out.println("20 crew, 30 passengers ");
        } else if (total == 75) {
            System.out.println("25 crew, 50 passengers ");
        } else if (total == 100) {
            System.out.println("30 crew, 70 passengers ");
        } else {
            System.out.println("Invalid");
        }


       /* switch (total){
            case 50 -> System.out.println("20 crew, 30 passengers ");
            case 75 -> System.out.println("25 crew, 50 passengers ");
            case 100 -> System.out.println("30 crew, 70 passengers ");
            default -> System.out.println("Invalid");

        */

    }
}
