package jd_07_practice_tasks;

public class RectangleClients {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();

        rectangle1.width = 6;
        rectangle1.length = 8;
        System.out.println("Rectangle1 = "+rectangle1.toString());
        System.out.println("Rectangle1 area = "+rectangle1.calculateArea());
        System.out.println("Rectangle1 perimeter = "+rectangle1.calculatePerimeter());

        System.out.println("______________________________________________");
        Rectangle rectangle2 = new Rectangle();
        rectangle2.length = 5;
        rectangle2.width = 10;

        System.out.println("Rectangle2 "+rectangle2.toString());
        System.out.println("Rectangle2 area = "+rectangle2.calculateArea());
        System.out.println("Rectangle2 perimeter = "+rectangle2.calculatePerimeter());

        System.out.println("________________________________________________________");

        Rectangle rectangle3 = new Rectangle();
        rectangle2.length = 15;
        rectangle2.width = 25;

        System.out.println("Rectangle3 "+rectangle3.toString());
        System.out.println("Rectangle3 area = "+rectangle3.calculateArea());
        System.out.println("Rectangle3 perimeter = "+rectangle3.calculatePerimeter());

    }
}
