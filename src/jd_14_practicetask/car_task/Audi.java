package jd_14_practicetask.car_task;

public class Audi extends Car implements AutoPark{
    public Audi(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }
     
    @Override
    public void Selfdrive() {
        System.out.println("Audi has AutoPark");
    }

    @Override
    public void start() {
        System.out.println("Audi is starting");
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
        System.out.println("Audi is driving");
    }
}
