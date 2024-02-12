package jd_02_variables_practice_tasks;

public class ShippingAddress {
    public static void main(String[] args) {
        String fullName="Aaron Kissinger";
        short buldingNumber = 13621;
        String streetName="Legacy Circle";
        String city="Fairfax";
        String state="VA";
        long zipCode=22030;
        System.out.print("Your Shipping address is :" + "\n \t\t\t\t" + fullName);
        System.out.println("\n\t\t\t\t"+buldingNumber+" "+streetName+"\n\t\t\t\t"+city+", "+state+" "+zipCode);
    }
}
