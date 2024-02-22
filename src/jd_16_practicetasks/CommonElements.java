package jd_16_practicetasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElements {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,8,11,20,5,0));


        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(30,0,20,40,50,10,60));

        List<Integer> commonElements = new ArrayList<>();

        for (Integer i : list) {
            for (Integer x : list1) {
                if (i == x){
                    commonElements.add(i);
                }
            }
        }
        System.out.println(commonElements);


    }
}

