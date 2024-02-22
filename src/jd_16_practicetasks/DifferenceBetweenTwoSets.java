package jd_16_practicetasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DifferenceBetweenTwoSets {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,5));

        List<Integer> set = new ArrayList<>();
        set.addAll(Arrays.asList(2,3,4));

        List<Integer> difference = new ArrayList<>();

        for (Integer each : list) {
            if (!set.contains(each)){
                difference.add(each);
            }
        }

        System.out.println(difference);

    }
}

