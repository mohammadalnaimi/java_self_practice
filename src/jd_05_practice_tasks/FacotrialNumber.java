package jd_05_practice_tasks;
/*
5. Create a class named FactorialNumber. Write a program that can return the factorial number of any given number.

				Example:
					  num = 5

				Output:
					  120

			(because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */
public class FacotrialNumber {
    public static void main(String[] args) {
        int num = 5;
        int multiple = 1 ;
        for (int i = 1; i <= num; i++) {
            multiple *=i;
        }
        System.out.println(multiple);
    }
}
