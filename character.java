// 39.	Program to accept a character and print it is a vowel or not.   ‘A’    9
// 40.	Program to accept a character and print it is a vowel or consonant.  ‘a’      ‘s’  
// 41.	Program to accept a character and print it is a vowel, consonant or a digit.
import java.util.Scanner;
public class character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        // char ch = sc.next().charAt(2);
        
        // Check if the character is a vowel
        // if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
        //     ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
        // if ("AEIOUaeiou".indexOf(ch) != -1) {
        //     System.out.println(ch + " is a vowel.");
        // } else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
        //     System.out.println(ch + " is a consonant.");
        // } else if (Character.isDigit(ch)) {
        //     System.out.println(ch + " is a digit.");
        // } else {
        //     System.out.println(ch + " is neither a vowel, consonant, nor a digit.");
        // }

        char ch = new Scanner(System.in).next().charAt(0);
        System.out.println(Character.isLetter(ch) ? ("aeiouAEIOU".indexOf(ch) != -1 ? ch + " is a vowel." : ch + " is a consonant.") : "Not an alphabet character.");
    }
}
