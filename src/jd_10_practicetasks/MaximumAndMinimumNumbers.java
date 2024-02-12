package jd_10_practicetasks;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;

public class MaximumAndMinimumNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>(Arrays.asList(1,2,3,4,5));

        int minimumNumber = Collections.min(list);
        int MaximumNumber = Collections.max(list);

        System.out.println("minimumNumber = " + minimumNumber);
        System.out.println("MaximumNumber = " + MaximumNumber);

    }
}
