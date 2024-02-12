package jd_11_practicetasks;

public class CydeoStudent {
    public String name;
    public int age;
    public int id;
    public double grade;
    public int batchNumber;
    public static String schoolName="Cydeo School";
    public static String programmingLanguage="Java programming language";

    public CydeoStudent(String name, int age, int id, double grade, int batchNumber) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;

    }
    public void study(){
        System.out.println(name+" is studying.");
        }
    public void attendClass(){
         System.out.println(name + " is attending the live class." );
     }
    //public void schoolName()
    {
         System.out.println(schoolName);
     }
    //public void progLanguage()
    {
         System.out.println(programmingLanguage);
     }


    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", grade=" + grade +
                ", batchNumber=" + batchNumber +
                '}';
    }
}
