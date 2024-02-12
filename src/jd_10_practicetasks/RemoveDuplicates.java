package jd_10_practicetasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,6,7,7));
        ArrayList<Integer> withoutDuplicates = new ArrayList<>();

        for (int i = 0; i < num.size(); i++) {
            if (!withoutDuplicates.contains(num.get(i)))
                withoutDuplicates.add(num.get(i));
        }
        System.out.println("withoutDuplicates = " + withoutDuplicates);

    }
}
