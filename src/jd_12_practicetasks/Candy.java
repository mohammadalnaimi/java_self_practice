package jd_12_practicetasks;

public class Candy {
    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {

        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0){
            System.err.println("Quantity can't be zero or negative number "+ quantity);
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0){
        System.err.println("Price can't be negative number "+ price);
        System.exit(1);
    }
        this.price = price;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }
    public String calcprice(double price){

        if (price == 0) {
            return "free";
        }else {
            return ""+ getPrice();
        }
    }

    @Override
    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=" + calcprice(price) +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
}
