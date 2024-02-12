package jd_09_practicetasks;

import java.util.Arrays;

/*
 Create a class named MoveTheZeros and write a program that can move all the zeros to the end of the array.

			Example:
				array = {10, 0, 5, 0, 1, 0};

			Output:
				{10, 5, 1, 0, 0, 0};
 */
public class MoveTheZeros {
    public static void main(String[] args) {
        int[] array = {10, 0, 5, 0, 1, 0};
        Arrays.sort(array);
        int[] arr = new int[array.length];
        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            arr[j]=array[i];
        }
        System.out.println(Arrays.toString(arr));

    }
}
