package jd_13_practicetasks.employee_task;

public class Teacher extends Employee{
    public Teacher(String name, String gender, String employeeId, String jobTitle, double salary, String companyName) {
        super(name, gender, employeeId, jobTitle, salary, companyName);
    }

    public void work(){
        System.out.println(getName()+" is teaching");
    }

}
