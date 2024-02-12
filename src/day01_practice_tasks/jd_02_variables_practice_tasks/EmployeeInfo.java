package jd_02_variables_practice_tasks;

public class EmployeeInfo {
    public static void main(String[] args) {
        String employeeName,employeeId,jobTitle,companyName;
        int age,salary;
        char gender;
        double yearsOfExperience;
        boolean isFullTime , isMarried;
            employeeName="Shay";
            age=24;
            gender='F';
            companyName="Apple Inc";
            jobTitle="SDET";
            yearsOfExperience=2.5;
            salary=120_000;
            isFullTime=true;
            isMarried=false;
            employeeId="B101";

        System.out.print("Employee name: "+employeeName+"\nGender: "+gender+"\nAge: "+age+"\nEmployeeId: "+employeeId);
        System.out.println("\nJob title: "+jobTitle+"\nCompany name: "+companyName+"\nFulltime: "+isFullTime);
        System.out.println("Years of work experience: "+yearsOfExperience+" years \n"+"Salary: $"+salary+".0"+"\nMarried: "+isMarried);
    }
}
