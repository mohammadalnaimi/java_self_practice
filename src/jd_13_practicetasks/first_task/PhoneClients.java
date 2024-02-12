package jd_13_practicetasks.first_task;

public class PhoneClients {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("Iphone","14 pro max","256",1125.99,"White");

        System.out.println(iphone);

        iphone.call(321547896);
        iphone.text(321547896);
        iphone.faceTime(321547896);
        System.out.println("________________________________________");

        Samsung samsung = new Samsung("Samsung","Galaxy","128",599.99,"Black");
        System.out.println(samsung);
        samsung.call(987456321);
        samsung.text(987456321);

        System.out.println("________________________________________________");

        Nokia nokia = new Nokia("Nokia ","n91","64",199.99,"red");
        System.out.println(nokia);
        nokia.call(654789321);
        nokia.text(654123987);






    }
}
