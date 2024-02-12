package jd04_selection_statement_practice_tasks;

public class Finra {
    public static void main(String[] args) {
        int num = 2;

        if (num % 5 == 0 && num % 3 == 0){
            System.out.println("FINRA");
        } else if (num % 3 == 0) {
            System.out.println("FIN");
        } else if (num % 5 == 0) {
            System.out.println("RA");
        }else {
            System.out.println("Invalid");
        }
        //  String result = (num % 5 == 0 && num % 3 == 0 ) ?"FINRA":(num % 3 == 0)?"FIN":(num % 5 == 0)? "RA" : "Invalid";
       // System.out.println(result);
    }
}
