package jd_09_practicetasks;
/*
 Create a class named ClassMatesInitials and write a program with the following specifications:
   2.1 Create an array of strings named classmates.
   2.2 Store full names of 10 classmates.
   2.3 Print the initials of each student's name in separate lines.
 */
public class ClassMatesInitials {
    public static void main(String[] args) {
        String [] classmates = {"Talah Alnaimi","Mike Jordan", "Tony Montana", "Sandy Martienez", "Ahmad Abd","Mohammad Alnaimi","Yahya Daaboul",
        "Bassil Alomar", "John Batez","Jose Hernandez"} ;

        for (int i = 0; i < classmates.length; i++) {
           String initial = classmates[i].charAt(0)+" "+classmates[i].charAt(classmates[i].indexOf(" ")+1);

            System.out.println(initial);
        }



    }
}
