package jd_12_practicetasks;
import static java.lang.Math.*;
public class Circle {
    private double radius;



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0){
            System.err.println("Radius can't be zero or negative number "+ radius);
            System.exit(1);
        }
        this.radius = radius;
    }
    public double calcArea(double radius){
        double area = radius*radius * PI ;
        return area;

    }
    public double calcPermieter(double radius){
        double perimeter = pow(radius , 2)* PI;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "Area= "+calcArea(radius)+
                "Permieter = "+calcPermieter(radius)+
                '}';
    }
}
