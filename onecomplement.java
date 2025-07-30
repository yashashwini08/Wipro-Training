// Program to find one’s complement (bitwise) of any number.
import java.util.Scanner;
public class onecomplement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Calculate one's complement
        int onesComplement = ~num;
        
        System.out.println("One's complement of " + num + " is: " + onesComplement);
    }
} 
