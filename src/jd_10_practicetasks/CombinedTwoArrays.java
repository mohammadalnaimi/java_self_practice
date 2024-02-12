package jd_10_practicetasks;

import java.util.ArrayList;
import java.util.Arrays;

public class CombinedTwoArrays {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>(Arrays.asList("A","B","C"));
        ArrayList<String> b = new ArrayList<>(Arrays.asList("D","E","F","G"));
        ArrayList<String> c = new ArrayList<>();
        c.addAll(a);
        c.addAll(b);
        System.out.println(c);


    }
}
