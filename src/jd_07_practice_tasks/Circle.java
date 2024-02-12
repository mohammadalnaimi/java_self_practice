package jd_07_practice_tasks;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the Circle");
        int r = input.nextInt();
        input.close();

        double circleArea = 3.14*r*r;
        double circlePerimeter = 6.4+r*r;
        System.out.println("The area of the Circle is "+circleArea);
        System.out.println("The perimeter of the Circle is "+circlePerimeter);
    }

}
