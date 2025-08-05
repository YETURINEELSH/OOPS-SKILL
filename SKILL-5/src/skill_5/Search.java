package skill_5;
import java.util.Scanner;
public class Search{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the value to search for: ");
        int searchValue = scanner.nextInt();
        int count = 0;
        for (int num : arr) {
            if (num == searchValue) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println(searchValue + " is present " + count + " times in the array.");
        } else {
            System.out.println(searchValue + " is not present in the array.");
        }
        scanner.close();
    }
}