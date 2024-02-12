package jd_12_practicetasks;


public class CandyClients {
    public static void main(String[] args) {
        Candy candy1 = new Candy();
        candy1.setBrand("Twix");
        candy1.setHasPeanuts(false);
        candy1.setQuantity(2);
        candy1.setPrice(0);

        System.out.println(candy1);

        Candy candy2 = new Candy();
        candy1.setPrice(-5);

    }
}