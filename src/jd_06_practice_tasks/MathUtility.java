package jd_06_practice_tasks;
public class MathUtility {
    public static void main(String[] args) {
        double result = calculate(10, '+', 20);
        System.out.println((int) result);

        result = calculate(2.5, '*', 3);
        System.out.println(result);

        int num = square(8);
        System.out.println(num);

        double num1 = square(1.5);
        System.out.println(num1);

        int num2 = cube(3);
        System.out.println(num2);

        double num3 = cube(2.5);
        System.out.println( num3);

    }

    public static int calculate(int a, char c, int b) {
        int result;
       return result = (c == '+') ? a + b : (c == '-') ? a - b : (c == '*') ? a * b : (c == '/') ? a / b : (c == '%') ? a % b : 0;

    }

    public static double calculate(double a, char c, double b) {
        double result;
       return result = (c == '+') ? a + b : (c == '-') ? a - b : (c == '*') ? a * b : (c == '/') ? a / b : (c == '%') ? a % b : 0;

    }

    public static int square(int a) {
        return calculate(a, '*', a);

    }

    public static double square(double a) {
        return calculate(a, '*', a);
    }

    public static int cube(int a){
        return square(a)*a;
    }

    public static double cube(double a){
        return square(a)*a;
    }



}
