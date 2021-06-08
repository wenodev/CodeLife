package ch5;

public class SalaryManager {
    public static void main(String[] args) {
        SalaryManager salaryManager = new SalaryManager();
        System.out.println(salaryManager.getMonthlySalary(20000000));
    }

    public double getMonthlySalary(int yearlySalary){
        double monthSalary = yearlySalary/12.0;
        double tax = calculateTax(monthSalary);
        double nationalPension = calculateNationalPension(monthSalary);
        double healthInsurance = calculateHealthInsurance(monthSalary);

        double total = tax + nationalPension + healthInsurance;
        monthSalary -= total;

        return monthSalary;
    }

    public double calculateTax(double monthSalary){
        System.out.println(monthSalary * 0.125);
        return monthSalary * 0.125;
    }

    public double calculateNationalPension(double monthSalary){
        System.out.println(monthSalary * 0.081);
        return monthSalary * 0.081;
    }

    public double calculateHealthInsurance(double monthSalary){
        System.out.println(monthSalary * 0.135);
        return monthSalary * 0.135;
    }

}

