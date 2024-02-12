package jd_05_practice_tasks;
/*

7. Create a class named Triangle and use a nested loop to display the following shape on the console:

				*
				* *
				* * *
				* * * *
				* * * * *
				* * * * * *
				* * * * * * *
				* * * * * * * *
				* * * * * * * * *
				* * * * * * * * * *
 */
public class Triangel {
    public static void main(String[] args) {
        for (int row = 1; row <= 10; row++) {
            for (int colomn = 1; colomn <= row ; colomn++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
