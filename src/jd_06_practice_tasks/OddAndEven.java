package jd_06_practice_tasks;

/*
1. Create a class named OddAndEven:

	1.1 Create a method named isOdd that returns true if a number is odd. Otherwise, it returns false.

			Example:
				boolean result = isOdd(100);

			Output:
				false

	1.2 Create a method named isEven that returns true if a number is even. Otherwise, it returns false.

			Example:
				boolean result = isEven(100);

			Output:
				true

 */
public class OddAndEven {
    public static void main(String[] args) {
        boolean result = isOdd(100);
        System.out.println(result);

        result = isEven(10);
        System.out.println(result);
    }
    public static boolean isOdd(int a) {
        boolean result = true;
        if (a % 2 == 1) {
            return result = true;
        } else {
            return result = false;
        }
    }
    public static boolean isEven(int a) {
        boolean result;
        if (a % 2 == 0) {
            return result = true;
        } else {
            return result = false;
        }
    }
}
