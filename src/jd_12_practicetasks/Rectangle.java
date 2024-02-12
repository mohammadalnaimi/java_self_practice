package jd_12_practicetasks;

public class Rectangle {

    private double width ;
    private double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0){
            System.err.println("Width can't be zero or negative number "+ width);
            System.exit(1);
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0){
            System.err.println("Length can't be zero or negative number "+ length);
            System.exit(1);
        }
        this.length = length;
    }

    public double calcArea(double length,double width){
        double area = length * width;
        return area;
    }

    public  double calcPerimeter(double length , double width){
        double perimeter = 2 * (length * width);
        return perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                "Area = "+ calcArea(length,width)+
                "Perimeter = "+calcPerimeter(length,width)+
                '}';
    }
}
