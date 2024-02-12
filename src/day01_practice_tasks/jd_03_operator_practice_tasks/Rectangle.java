package day01_practice_tasks.jd_03_operator_practice_tasks;

public class Rectangle {
    public static void main(String[] args) {
        double length = 4.5,
                width = 2,
                area = length * width,
                preimeter = 2 *(length + width);
        System.out.println("the area of rectangle is "+ area);
        System.out.println("The preimeter of the rectangle is " + preimeter);
    }
}
