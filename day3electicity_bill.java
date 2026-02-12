import java.util.Scanner;

public class day3electicity_bill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        double bill;

        if (units <= 100) {
            bill = units * 1.5;
            System.out.println("Electricity Bill = ₹ " + bill);
        }
        else if (units <= 200) {
            bill = units * 2.5;
            System.out.println("Electricity Bill = ₹ " + bill);
        }
        else if (units <= 300) {
            bill = units * 4;
            System.out.println("Electricity Bill = ₹ " + bill);
        }
        else {
            bill = units * 6;
            System.out.println("Electricity Bill = ₹ " + bill);
        }


    }
}
