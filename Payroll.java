import java.util.Scanner;

    class Payroll{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Employee Payroll System");

        // Employee information
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee ID: ");
        int employeeId = scanner.nextInt();

        // Salary information
        System.out.print("Enter base salary: ");
        double baseSalary = scanner.nextDouble();

        // Deductions
        System.out.print("Enter tax rate (in percentage): ");
        double taxRate = scanner.nextDouble();
        double taxDeduction = (taxRate / 100) * baseSalary;

        System.out.print("Enter other deductions: ");
        double otherDeductions = scanner.nextDouble();

        // Calculate total salary
        double totalSalary = baseSalary - taxDeduction - otherDeductions;

        // Display pay stub
        System.out.println("\nPay Stub for " + name + " (Employee ID: " + employeeId + ")");
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Tax Deduction: $" + taxDeduction);
        System.out.println("Other Deductions: $" + otherDeductions);
        System.out.println("Total Salary: $" + totalSalary);

        scanner.close();
    }
}
