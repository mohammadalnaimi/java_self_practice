package jd_13_practicetasks.employee_task;

public class EmployeeClients {
    public static void main(String[] args) {

        Tester tester = new Tester("Mohammad","Male","A001","QA",120_000,"Google");

        System.out.println(tester);
        tester.work();

        System.out.println("________________________________");

        Developer developer = new Developer("Alixa","Female","A002","Developer",110_000,"Amazon","java");
        System.out.println(developer);
        developer.work();


    }
}
