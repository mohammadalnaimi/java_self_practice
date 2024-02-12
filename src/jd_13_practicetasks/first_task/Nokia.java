package jd_13_practicetasks.first_task;

public class Nokia extends Phone{

    public Nokia(String brand, String model, String size,double price , String color){
        super(brand ,model , size ,price , color );
    }


    @Override
    public void call(int phoneNumber) {
        super.call(phoneNumber);
    }

    @Override
    public void text(int phoneNumber) {
        super.text(phoneNumber);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
