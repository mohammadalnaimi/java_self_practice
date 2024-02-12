package jd_07_practice_tasks;

public class EmployeeClient {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "Tony Dinarro";
        employee1.age = 36;
        employee1.gender = 'M';
        employee1.jobTitle = "BA";
        employee1.salary = 5000;
        System.out.println(employee1);
        employee1.work();

        System.out.println("________________________________________");
        Employee employee2 = new Employee();
        employee2.name = "Sarah Fernandez ";
        employee2.age = 38;
        employee2.salary = 6500;
        employee2.gender = 'F';
        employee2.jobTitle = "PO";

        System.out.println(employee2);
        employee2.work();





    }
}
