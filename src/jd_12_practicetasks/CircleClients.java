package jd_12_practicetasks;

public class CircleClients {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.setRadius(1);
        System.out.println(circle1.getRadius());
        System.out.println(circle1);

        Circle circle2 = new Circle();
        circle2.setRadius(-6);
        System.out.println(circle2.getRadius());
        System.out.println(circle2);


    }
}
