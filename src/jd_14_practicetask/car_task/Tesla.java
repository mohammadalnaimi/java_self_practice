package jd_14_practicetask.car_task;

public class Tesla extends Car implements AutoPilot{
    public Tesla(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
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
    public void start() {
        System.out.println("Tesla is starting");
    }

    @Override
    public void drive() {
        System.out.println("Tesla is driving");
    }

    @Override
    public void SelfDrive() {
        System.out.println("Tesla has selfdriving");
    }

    @Override
    public void Selfdrive() {

    }
}
