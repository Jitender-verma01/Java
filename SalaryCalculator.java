import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
        // Define regular working hours and overtime rate
        final int REGULAR_HOURS = 40;
        final double OVERTIME_RATE = 1.5;

        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Input: hours worked and hourly rate
        System.out.print("Enter hours worked: ");
        double hoursWorked = scanner.nextDouble();
        System.out.print("Enter hourly rate: ");
        double hourlyRate = scanner.nextDouble();

        // Calculate total salary
        double totalSalary;
        if (hoursWorked <= REGULAR_HOURS) {
            // Calculate salary for regular hours
            totalSalary = hoursWorked * hourlyRate;
        } else {
            // Calculate salary including overtime
            double regularSalary = REGULAR_HOURS * hourlyRate;
            double overtimeHours = hoursWorked - REGULAR_HOURS;
            double overtimeSalary = overtimeHours * hourlyRate * OVERTIME_RATE;
            totalSalary = regularSalary + overtimeSalary;
        }

        // Output the result
        System.out.printf("Total salary is: $%.2f%n", totalSalary);
    }
}
