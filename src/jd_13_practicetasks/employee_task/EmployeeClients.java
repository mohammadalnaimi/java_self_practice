package jd_13_practicetasks.employee_task;

public class EmployeeClients {
    public static void main(String[] args) {

        Tester tester = new Tester("Mohammad","Male","A001","QA",120_000,"Google");

        System.out.println(tester);
        tester.work();

        System.out.println("________________________________");

        Developer developer = new Developer("Sophia","female","a002","Developer",120_000,"Amazon","Python");
        System.out.println(developer);
        developer.work();

        System.out.println("______________________________________");
        Driver driver = new Driver("Sal","Male","a003","Driver",80000,"Walmart");
        System.out.println(driver);
        driver.work();



    }
}
