package jd_13_practicetasks.employee_task;

public class Employee extends Person{


    private String employeeId;
    private String jobTitle;
    private double salary;
    private String companyName;

    public Employee(String name, String gender, String employeeId, String jobTitle, double salary, String companyName) {
        super(name, gender);
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setSalary(salary);
        setCompanyName(companyName);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {

        if (employeeId == null || employeeId.isBlank()  || employeeId.isEmpty()) {
            throw new RuntimeException("Invalid entry can't be null empty or blank");
        }

        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {


        if (jobTitle == null || jobTitle.isBlank()  || jobTitle.isEmpty()) {
            throw new RuntimeException("Invalid entry can't be null empty or blank");
        }

        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {

        if (salary <= 0){
            throw new RuntimeException("Invalid entry can't be zero or less");
        }

        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        if (companyName == null || companyName.isBlank()  || companyName.isEmpty()) {
            throw new RuntimeException("Invalid entry can't be null empty or blank");
        }
        this.companyName = companyName;
    }

    public void work(){
        System.out.println("jobTitle "+jobTitle +" Employee name "+getName());
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", gender='" + getGender() + '\'' +
                "employeeId='" + employeeId + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
