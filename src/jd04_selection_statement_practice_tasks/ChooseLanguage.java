package jd04_selection_statement_practice_tasks;

public class ChooseLanguage {
    public static void main(String[] args) {
        int selection = 3;

        if (selection == 1){
            System.out.println("Hello, thank you for your call");
        }
        else if (selection ==2 ) {
            System.out.println("Hola, gracias por llamar");
        }
        else if (selection == 3) {
            System.out.println("Merhaba, aradığınız için teşekkürler");
        }
        else if (selection == 4) {
            System.out.println("Привет, спасибо за ваш звонок");
        }
        else if (selection == 5) {
            System.out.println("Merci, pour votre appel");
        } else {
            System.out.println("Invalid entery");
        }
    }
}



       /* switch (selection){

            case 1 -> System.out.println("Hello, thank you for your call");

            case 2 -> System.out.println("Hola, gracias por llamar");

            case 3 -> System.out.println("Merhaba, aradığınız için teşekkürler");

            case 4 -> System.out.println("Привет, спасибо за ваш звонок");

            case 5 -> System.out.println("Merci, pour votre appel");

            default -> System.out.println("Invalid entery");

        }

        */

