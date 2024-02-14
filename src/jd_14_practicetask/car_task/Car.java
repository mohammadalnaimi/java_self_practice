package jd_14_practicetask.car_task;

public abstract class Car {
private final String make;
private final String model ;
private final int year;
private double price;
private String color;


    public Car(String make, String model, int year, double price, String color) {
        this.make = setmake(make);
       this.model = model(model);
        this.year = setyear(year);
        setPrice(price);
        setColor(color);
    }


    public int setyear(int year){
        if (year < 1886){
            throw new RuntimeException("yaer can't be less than 1886");
        }
        return year;
    }

    public String setmake(String make){
        if (make == null || make.isBlank() || make.isEmpty()){
            throw new RuntimeException("make can't be null empty or blank");
        }
        return make;
    }


    public String model(String model){
        if (model == null || model.isBlank() || model.isEmpty()){
            throw new RuntimeException("model can't be null empty or blank");
        }
        return model;
    }



    public String getMake() {
        return make;
    }

    public String getModel() {return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0 ){
            throw new RuntimeException("price can't be negative.");
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()){
            throw new RuntimeException("color can't be null empty or blank");
        }
        this.color = color;
    }

    public abstract void start();
    public abstract void drive();

    public void stop(){
        System.out.println(make + ", "+model+" is stoping");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
