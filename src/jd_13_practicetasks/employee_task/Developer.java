package jd_13_practicetasks.employee_task;

public class Developer extends Employee{
    private String prgrammingLangauge;

    public Developer(String name, String gender, String employeeId, String jobTitle, double salary, String companyName, String prgrammingLangauge) {
        super(name, gender, employeeId, jobTitle, salary, companyName);
        setPrgrammingLangauge(prgrammingLangauge);
    }

    public String getPrgrammingLangauge() {
        return prgrammingLangauge;
    }

    public void setPrgrammingLangauge(String prgrammingLangauge) {
        if (prgrammingLangauge == null || prgrammingLangauge.isBlank()  || prgrammingLangauge.isEmpty()) {
            throw new RuntimeException("Invalid entry can't be null empty or blank");
        }
        this.prgrammingLangauge = prgrammingLangauge;
    }

    public void work(){
        System.out.println(getJobTitle()+" "+getName()+" is coding in "+prgrammingLangauge);
    }

}
