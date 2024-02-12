package jd_09_practicetasks;
/*
 6.1 Create an array of strings named classmates.
   6.2 Store full names of 10 classmates.
   6.3 Reverse each student's name and print them on separate lines.
 */
public class ClassMatesReversed {
    public static void main(String[] args) {
        String [] classMates = {"Talah Alnaimi","Mike Jordan", "Tony Montana", "Sandy Martienez", "Ahmad Abd","Mohammad Alnaimi","Yahya Daaboul",
                "Bassil Alomar", "John Batez","Jose Hernandez"};
        for (int i = 0; i < classMates.length; i++) {
            String x = classMates[i];
            for (int j = x.length()-1 ; j >= 0 ;j--){
                System.out.print(x.charAt(j));
            }
            System.out.println();
        }


    }
}
