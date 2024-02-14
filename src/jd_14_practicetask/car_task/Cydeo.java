package jd_14_practicetask.car_task;

public class Cydeo extends Car implements AutoPilot , Flyable{
    public Cydeo(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void Selfdrive() {
        System.out.println("Cydeo has selfdrive");
    }

    @Override
    public void SelfDrive() {

    }

    @Override
    public void start() {
        System.out.println("Cydeo is starting");

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
        System.out.println("Cydeo is driving");
    }

    @Override
    public void fly() {
        System.out.println("Cydeo is flying");
    }
}
