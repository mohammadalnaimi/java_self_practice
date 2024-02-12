package jd_08_practicetasks;

public class EmailTask2 {
    public static void main(String[] args) {
        String email = "mohammad_alnaimi@cydeo.com";
        String firstName = email.substring(0,email.indexOf("_"));
        System.out.println("FirstName = " + firstName.toUpperCase().charAt(0)+firstName.substring(1));

        String lastName = email.substring(email.indexOf("_")+1,email.indexOf("@"));
        System.out.println("LastName = " + lastName.toUpperCase().charAt(0)+lastName.substring(1));

        String domain = email.substring(email.indexOf("@")+1,email.indexOf("."));
        System.out.println("Domain = " + domain.toUpperCase().charAt(0)+domain.substring(1));

    }

}
