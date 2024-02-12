package jd_10_practicetasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveTheZeros {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));


        int countZeros = Collections.frequency(a, 0);

        a.removeAll(Arrays.asList(0));

        for (int i = 0; i < countZeros; i++) {
            a.add(0);
        }

        System.out.println(a);


    }
}
