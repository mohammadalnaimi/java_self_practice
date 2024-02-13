package jd_13_practicetasks.employee_task;

public class Tester extends Employee{


    public Tester(String name, String gender, String employeeId, String jobTitle, double salary, String companyName) {
        super(name, gender, employeeId, jobTitle, salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+"  "+getName()+" is Testing");
    }
}
