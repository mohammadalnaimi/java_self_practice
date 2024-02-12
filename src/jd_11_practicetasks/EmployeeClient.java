package jd_11_practicetasks;

public class EmployeeClient {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Mike",40,'m',"Sales Manager",6000);
        Employee employee2 = new Employee("Sarah",30,'F',"PO",12000);


        employee1.work();
        System.out.println(employee1);

        employee2.work();
        System.out.println(employee2);



    }
}
