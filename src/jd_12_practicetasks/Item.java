package jd_12_practicetasks;


public class Item {

    private String name;
    private  double unitPrice ;
    private  int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        boolean x = true;
        char[] eachLetter = name.toCharArray();
        for (char c : eachLetter) {
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c))
                x=false;
        }

        if (name.isBlank() || name.isEmpty() || !Character.isLetter(name.charAt(0)) || x==false ){
            System.err.println("Name can't be empty blank has special character or the name must start with letter");
            System.exit(1);

        }

        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0){
            System.err.println("Unit Price can't be negative number "+ unitPrice);
            System.exit(1);
        }

        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0){
            System.err.println("Quantity can't be negative number "+ quantity);
            System.exit(1);
        }
        this.quantity = quantity;
    }
    public double calcCost(double unitPrice , int quantity){
        double cost = unitPrice* quantity;
        return cost;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                "Cost = "+calcCost(unitPrice,quantity)+
                '}';
    }
}
