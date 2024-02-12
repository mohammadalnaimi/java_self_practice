package jd_13_practicetasks.first_task;

public class Phone {

    private String brand;
    private String model;
    private String size;
    private double price;
    private String color;

    public String getBrand() {
        return brand;
    }


    public Phone (String brand, String model, String size, double price, String color) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);
    }

    public void setBrand(String brand) {
        if (brand.isEmpty() || brand.isBlank() || brand == null){
            throw new RuntimeException("brand can't be empty null or blank");
        }
            this.brand = brand;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.isBlank() || model.isEmpty() || model == null){
            throw new RuntimeException("model can't be empty null or blank");
        }else {
            this.model = model;
        }
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0 ) {
            this.price = price;
        }else {
            throw new RuntimeException("price can't be zero or less than zero");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.isEmpty() || color.isBlank() || color == null){
            throw new RuntimeException("color can't be empty null or blank");
        }else {
            this.color = color;
        }
    }

    public void call(int phoneNumber){
        System.out.println("calling the number "+ phoneNumber);

    }

    public void text (int phoneNumber ){
        System.out.println("texting the number "+phoneNumber);
    }
    public void faceTime(int phoneNumber){
        System.out.println("facetiming with the number "+phoneNumber);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
