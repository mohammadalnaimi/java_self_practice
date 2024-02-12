package jd_09_practicetasks;
/*
reate a class named EvenOddNumbers and write a program that counts the even and odd numbers from an array of integers.

			Example:
				array = {1, 2, 3, 4, 5, 6, 7};

			Output:
				The array has 4 odd numbers and 3 even numbers.

 */
public class EvenOddNumbers {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,5,5,5,5,};
        int even = 0;
        int odd = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] %2 == 0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("The array has "+odd+" odd numbers and "+even+" even numbers.");

    }
}
