// Program to check whether an entered integer is a perfect square or not.
import java.util.Scanner;
public class squareno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        
        // Check if the number is a perfect square
        double sqrt = Math.sqrt(num);
        if (sqrt == Math.floor(sqrt)) {
            System.out.println(num + " is a perfect square.");
        } else {
            System.out.println(num + " is not a perfect square.");
        }
    }
}