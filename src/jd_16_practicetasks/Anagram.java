package jd_16_practicetasks;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "abcd";
        String str2 = "ccddabaa";

        Set<Character> list = new HashSet<>() ;
        for (char c : str1.toCharArray()) {
            list.add(c);
        }
        System.out.println(list);

        Set<Character> list1 = new HashSet<>();
        for (char c : str2.toCharArray()) {
            list1.add(c);
        }
        boolean x = list1.equals(list);
        System.out.println(x);




    }
}

