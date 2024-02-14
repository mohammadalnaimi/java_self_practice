package jd_14_practicetask.car_task;
public class Toyota extends Car {
    public Toyota(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }




    @Override
    public void start() {
        System.out.println("Toyota car is starting");
    }

    @Override
    public void drive() {
        System.out.println("toyota car is driving ");
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
