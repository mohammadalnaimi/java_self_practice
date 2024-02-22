package jd_16_practicetasks;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(Arrays.asList(20,15,10,20,30,10,20,15,0));
        List<Integer> num = new ArrayList<>(set);
        Collections.sort(num);
        System.out.println(num);
    }
}
