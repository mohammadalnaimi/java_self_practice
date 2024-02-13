package jd_13_practicetasks.employee_task;

public class Person {

    private String name;
    private String gender;

    public Person(String name, String gender){
        setName(name);
        setGender(gender);

    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender == null || gender.isBlank()  || gender.isEmpty()){
            throw new RuntimeException("Invalid entry can't be null empty or blank");
        }
        this.gender = gender;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){

        if (name == null || name.isBlank()  || name.isEmpty()) {
            throw new RuntimeException("Invalid entry can't be null empty or blank");
        }
        this.name=name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
