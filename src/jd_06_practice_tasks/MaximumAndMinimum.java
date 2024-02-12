package jd_06_practice_tasks;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        int m = max(10, 100);
        System.out.println(m);

        double md = max(100.8, 100.8);
        System.out.println(md);

        int minimum = min(5, 9);
        System.out.println(minimum);

        double minD = min(5.6, 9.8);
        System.out.println(minD);
    }

    public static int max(int a, int b) {
        int max;
        if (a > b) {
             max = a;
        } else if (b > a) {
            max = b;
        } else {
            System.out.print("Invaild entry both numbers can't be equal");
             max = 0;
        }
        return max;

    }

    public static double max(double a, double b) {
        double max;
        if (a > b) {
            return max = a;
        } else if (b > a) {
            return max = b;
        } else {
            System.out.println("Invaild entry both numbers can't be equal");
            return 0;
        }
    }

    public static int min(int a, int b) {
        int minimum;
        if (a < b) {
            return minimum = a;
        } else if (b < a) {
            return minimum = b;
        } else {
            System.out.println("Invaild entry both numbers can't be equal");
            return 0;

        }
    }

    public static double min(double a, double b) {
        double minimum;
        if (a < b) {
            return minimum = a;
        } else if (b < a) {
            return minimum = b;
        } else {
            System.out.println("Invaild entry both numbers can't be equal");
            return 0;

        }
    }
}
