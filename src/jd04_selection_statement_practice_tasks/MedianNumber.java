package jd04_selection_statement_practice_tasks;

public class MedianNumber {
    public static void main(String[] args) {
        int a =70, b = 50, c = 100;
        int greater , smaller , median;

        if (a > b && a > c){ greater = a;
        } else if (b > a && b > c) { greater = b;
        } else { greater = c;}

        if (a < b && a < c) {smaller =a;
        } else if (b < a && b < c) {smaller =b;
        } else {smaller =c;}

        if (a > smaller && a < greater) {median =a;
        } else if (b > smaller && b < greater) {median =b;
        }else {median = c;}
        System.out.println(median + " is the median number");



    }
}
