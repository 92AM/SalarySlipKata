package org.neomatrix369.salaryslip;

public class SalarySlipGenerator {

    public static double calculateNationalInsurance(double grossSalary) {

        return grossSalary <= 8060.00 ? 0 : (grossSalary > 8060.00 || grossSalary < 43000 ?
                grossSalary - (grossSalary * 0.12) : grossSalary - (grossSalary * 0.14));

    }

    public static double calculateTax(double grossSalary) {

        return grossSalary <= 11000.00 ? 0 : (grossSalary > 11000.00 || grossSalary < 43000 ?
                grossSalary - (grossSalary * 0.20) : (grossSalary > 43000.00 || grossSalary < 150000.00 ?
                grossSalary - (grossSalary * 0.40) : grossSalary - (grossSalary * 0.45)));

    }

}
