package skill3;
import java.util.Scanner;
public class PerfectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sqrt = (int) Math.sqrt(n);
        if (sqrt * sqrt == n) {
            System.out.println(n + " is a perfect square.");
        } else {
            System.out.println(n + " is not a perfect square.");
        }
        sc.close();
    }
}
