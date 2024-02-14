package jd_14_practicetask.car_task;

public class BMW extends Car{
    public BMW(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("BMW is starting");
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void drive() {
        System.out.println("BMW is driving");
    }
}
