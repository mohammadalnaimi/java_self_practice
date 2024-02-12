package jd_07_practice_tasks;

public class ItemClients {
    public static void main(String[] args) {
        Item item1 = new Item();
        item1.itemName = "BCAA";
        item1.unitPrice = 30;
        item1.quantity = 2;

        System.out.println("Item1 cost: "+item1.calcCost());
        System.out.println(item1.toString());
        System.out.println("_______________________________________________");

        Item item2 = new Item();
        item2.itemName = "Whey Protien ";
        item2.unitPrice = 60;
        item2.quantity = 2;

        System.out.println("Item2 cost: "+item2.calcCost());
        System.out.println(item2.toString());
        System.out.println("_______________________________________________");

        Item item3 = new Item();
        item3.itemName = "EAA";
        item3.unitPrice = 35;
        item3.quantity = 2;

        System.out.println("Item3 cost: "+item3.calcCost());
        System.out.println(item3.toString());
        System.out.println("_______________________________________________");



    }
}
