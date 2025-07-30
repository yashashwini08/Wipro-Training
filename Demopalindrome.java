import java.util.Scanner;
public class Demopalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a digit:");
        int digit = scanner.nextInt();
        int original = digit;  // Store original value
        int evenCount = 0;
        int oddCount = 0;
        int rem;
        int temp = digit; // Use a temp variable for the first loop

        while (temp != 0) {
            rem = temp % 10;
            if (rem % 2 == 0) {
                evenCount++;
                System.out.println("Even digit: " + rem);
            } else {
                oddCount++;
                System.out.println("Odd digit: " + rem);
            }
            temp /= 10; // Update temp to avoid infinite loop
        }
        System.out.println("Number of even digits: " + evenCount);
        System.out.println("Number of odd digits: " + oddCount);

        int rev = 0;
        temp = digit; // Reset temp for palindrome check
        while (temp != 0) {
            int num = temp % 10;
            rev = rev * 10 + num;
            temp /= 10;
        }

        if (rev == original) {
            System.out.println("The digit is a palindrome.");
        } else {
            System.out.println("The digit is not a palindrome.");
        }

        scanner.close(); // Always good to close the Scanner
    }
}