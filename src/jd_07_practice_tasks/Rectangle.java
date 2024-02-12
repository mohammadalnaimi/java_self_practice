package jd_07_practice_tasks;
public class Rectangle {
    public int width;
    public int length;

    public double calculateArea(){
        double areaOfRectangle = width * length ;
        return areaOfRectangle;
    }
    public double calculatePerimeter(){
         double perimeter = 2 * (width * length);
        return perimeter;

    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
