
 import java.util.Scanner;

public class salary
{
    public static void main(String[] args)
    { 
        Scanner sc = new Scanner(System.in);

        // Monthly salary input
        System.out.println("Enter monthly salary:");
        double monthlySalary = sc.nextDouble();

        // Yearly salary calculation
        double yearlySalary = monthlySalary * 12;

        // Output
        System.out.println("Monthly Salary: " + monthlySalary);
        System.out.println("Yearly Salary: " + yearlySalary);

        sc.close();
    }
}


