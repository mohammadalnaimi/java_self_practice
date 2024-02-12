package jd_11_practicetasks;

public class CydeoStudentClients {
    public static void main(String[] args) {
        CydeoStudent student1 = new CydeoStudent("Mohammad",35,3569874,96.8,35);

        student1.study();
        student1.attendClass();
       // student1.schoolName();
       // student1.progLanguage();
        System.out.println(student1);


        System.out.println("____________________________________________");


        CydeoStudent student2 = new CydeoStudent("Sandy",29,65874,84.5,36);
        student2.study();
        student2.attendClass();
        System.out.println(student2);


    }



}
