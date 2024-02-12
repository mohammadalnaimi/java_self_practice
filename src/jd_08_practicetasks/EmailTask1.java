package jd_08_practicetasks;

public class EmailTask1 {
    public static void main(String[] args) {
        String email = "miket_yson@gmail.com";

        if ( email.contains("_")){
            String firstName = email.substring(0,email.indexOf("_"));
            String lastName = email.substring(email.indexOf("_")+1,email.indexOf("@"));
            System.out.println(email.replaceFirst(lastName,firstName).replaceFirst(firstName,lastName));

        }else {
            System.out.println(email);
        }


    }
}
