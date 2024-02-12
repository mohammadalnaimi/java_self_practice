package jd_07_practice_tasks;

public class Item {
    public String itemName;
    public double unitPrice;
    public int quantity;

    public double calcCost(){
        double totalCost = quantity * unitPrice;
        return totalCost;
    }

    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", totalCost="+calcCost()+
                '}';
    }
}
