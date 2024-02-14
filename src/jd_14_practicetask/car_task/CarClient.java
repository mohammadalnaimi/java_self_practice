package jd_14_practicetask.car_task;

public class CarClient {
    public static void main(String[] args) {
        Toyota toyota = new Toyota("Toyota","Camry",2015,12_000,"White");
        System.out.println(toyota);
        toyota.start();
        toyota.drive();
        toyota.stop();
        System.out.println("__________________________________");

        Honda honda = new Honda("Honda ","Pilot",2019,20_000,"Silver");
        System.out.println(honda);
        honda.drive();
        honda.start();
        honda.stop();

        System.out.println("_________________________________________");

        BMW bmw = new BMW("BMW","X7",2024,65_000,"Black");
        System.out.println(bmw);
        bmw.drive();
        bmw.start();
        bmw.stop();





    }
}
