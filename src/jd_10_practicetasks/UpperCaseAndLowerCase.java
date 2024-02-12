package jd_10_practicetasks;

public class UpperCaseAndLowerCase {
    public static void main(String[] args) {
        String str = "JAVA java";
        int a = 0;
        int b = 0;
        char [] x = str.toCharArray();
        for (char c : x) {
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    a += 1;
                } else {
                    b += 1;
                }
            }
        }
        if (a==b){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }
}
