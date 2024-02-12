package jd_10_practicetasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLetters {
    public static void main(String[] args) {

        ArrayList<Character> y = new ArrayList<>();
        y.addAll(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));
        ArrayList<Character> x = new ArrayList<>();
        for (Character each : y) {
            if (!Character.isLetter(each)) {
                   x.add(each);
            }
        }
        System.out.println(x);


    }
}
