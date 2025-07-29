package skill1;
import java.util.Scanner;

public class NarrowCon{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a double value: ");
        double doubleValue = sc.nextDouble();
        
        int intValue = (int) doubleValue; 
        
        System.out.println("Double value: " + doubleValue);
        System.out.println("Converted int value: " + intValue);
        
        sc.close();
    }
}

