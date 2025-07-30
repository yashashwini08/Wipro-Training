import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a digit:");
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        int original = digit;  //Store original value

        int rev = 0;
        while (digit != 0) {
            int num = digit % 10;
            rev = rev * 10 + num;
            digit /= 10;
        }

        if (rev == original) {
            System.out.println("The digit is a palindrome.");
        } else {
            System.out.println("The digit is not a palindrome.");
        }

        scanner.close(); //Always good to close the Scanner
    }
}



// import java.util.Scanner;

// public class palindrome {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter an integer:");
//         String numStr = sc.next();
//         // Print 2nd digit if it exists
//         if (numStr.length() >= 2) {
//             System.out.println("2nd digit: " + numStr.charAt(1));
//         } else {
//             System.out.println("Number has less than 2 digits");
//         }

//         // Check palindrome
//         String reversed = new StringBuilder(numStr).reverse().toString();
//         if (numStr.equals(reversed)) {
//             System.out.println("The number is a palindrome.");
//         } else {
//             System.out.println("The number is not a palindrome.");
//         }
//         sc.close();
//     }
// }