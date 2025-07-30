// Write a program to demonstrate increment & decrement operators.
public class increment {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Initial value of a: " + a);
        
        // Increment operator
        System.out.println("Value after incrementing a: " + (++a));
        
        // Decrement operator
        System.out.println("Value after decrementing a: " + (--a));
        
        // Post-increment operator
        System.out.println("Value after post-incrementing a: " + (a++));
        System.out.println("Value of a after post-increment: " + a);
        
        // Post-decrement operator
        System.out.println("Value after post-decrementing a: " + (a--));
        System.out.println("Final value of a: " + a);
    }
}
