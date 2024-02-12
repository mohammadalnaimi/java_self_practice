package day01_practice_tasks.jd_03_operator_practice_tasks;

public class SalaryCalculator {
    public static void main(String[] args) {
        double hourlyRate = 50,
                stateTaxRate = 0.06,
                fedralTaxRate = 0.26;
        int weeklyHours = 45;
        double yearlyGross = 52 * (weeklyHours * hourlyRate);
        double yearlyStateTax = yearlyGross * stateTaxRate ;
        double yearlyFedralTax = yearlyGross * fedralTaxRate;
        double totalTax = yearlyFedralTax + yearlyStateTax;
        double netIncome = yearlyGross - totalTax ;
        System.out.println("Gross pay is: $" + yearlyGross);
        System.out.println("Fedral state tax is: $"+yearlyFedralTax);
        System.out.println("State tax is: $"+ yearlyStateTax);
        System.out.println("total tax is: $"+ totalTax);
        System.out.println("Net income is: $"+ netIncome);





    }
}
