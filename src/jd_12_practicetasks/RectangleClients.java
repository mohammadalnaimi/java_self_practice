package jd_12_practicetasks;

public class RectangleClients {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();

        rectangle1.setLength(4);
        rectangle1.setWidth(6);

        System.out.println(rectangle1.getLength()+"\t"+rectangle1.getWidth());
        System.out.println(rectangle1);

        Rectangle rectangle2= new Rectangle();
        rectangle2.setWidth(5);
        rectangle2.setLength(-8);




        System.out.println(rectangle2.getLength()+"\t"+rectangle2.getWidth());
        System.out.println(rectangle2);


    }
}
