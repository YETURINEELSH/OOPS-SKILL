package skill3;
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of units consumed: ");
        int units = sc.nextInt();
        int billAmount = 0;
        if (units >= 51 && units <= 100) {
            billAmount = units * 3;
        } else if (units >= 101 && units <= 300) {
            billAmount = units * 5 + 100;
        } else if (units >= 301 && units <= 450) {
            billAmount = units * 6 + 200;
        } else if (units > 450) {
            billAmount = units * 8 + 250;
        } else {
            System.out.println("No bill for units <= 50");
            sc.close();
            return;
        }
        System.out.println("Units consumed: " + units);
        System.out.println("Total bill amount: Rs. " + billAmount);
        sc.close();
    }
}
