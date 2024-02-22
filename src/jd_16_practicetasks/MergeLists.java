package jd_16_practicetasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeLists {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,20,30,40,50,60,70));

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(30,10,50,60,70,80,90,100));

        List<Integer> list2 = new ArrayList<>(list);
        list2.addAll(list1);

        List<Integer> unique = new ArrayList<>();

        for (Integer each : list2) {
            if (unique.contains(each)){
                continue;
            }
            unique.add(each);
        }

        System.out.println(unique);


    }
}

