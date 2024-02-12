package jd_09_practicetasks;
/*
 Create a class named CommonElements and write a program that prints out the common elements from two integer arrays.

			Example:
				arr1: {1,2,3,4,5}
				arr2: {4,5,6,7,8}

			Output:
				4
				5
 */
public class CommonElements {
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5};
        int[] y = {4,5,6,7,8};
        for (int i = 0; i < x.length; i++) {
            for (int i1 = 0; i1 < y.length; i1++) {
                if (x[i]==y[i1])
                    System.out.println(x[i]);
            }
        }

    }
}
