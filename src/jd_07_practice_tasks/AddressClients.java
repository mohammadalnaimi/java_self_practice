package jd_07_practice_tasks;

public class AddressClients {
    public static void main(String[] args) {
        Address address = new Address();
        address.buildingNumber= 7925;
        address.street="Jones Branch Dr";
        address.city="Mclean";
        address.state="Va";
        address.zipCode="22012";

        System.out.println(address.toString());

        System.out.println("---------------------------------------------");
        Address address1 = new Address();
        address1.buildingNumber= 56;
        address1.street="Vernon Ave";
        address1.city="Yonkers";
        address1.state="Ny";
        address1.zipCode="10704";

        System.out.println(address1.toString());
        System.out.println("----------------------------------------");
        Address address2 = new Address();
        address2.buildingNumber= 96;
        address2.street="Glenridge Dr";
        address2.city="Portland";
        address2.state="Me";
        address2.zipCode="02510";

        System.out.println(address2.toString());
    }
}
