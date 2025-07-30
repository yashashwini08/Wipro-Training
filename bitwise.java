//  Program to demonstrate working of bitwise operators in java.
public class bitwise {
    public static void main(String[] args) {
        int a = 5;  // 0101 in binary
        int b = 3;  // 0011 in binary
        
        System.out.println("a: " + a + " (binary: " + Integer.toBinaryString(a) + ")");
        System.out.println("b: " + b + " (binary: " + Integer.toBinaryString(b) + ")");
        
        // Bitwise AND
        System.out.println("a & b: " + (a & b) + " (binary: " + Integer.toBinaryString(a & b) + ")");
        
        // Bitwise OR
        System.out.println("a | b: " + (a | b) + " (binary: " + Integer.toBinaryString(a | b) + ")");
        
        // Bitwise XOR
        System.out.println("a ^ b: " + (a ^ b) + " (binary: " + Integer.toBinaryString(a ^ b) + ")");
        
        // Bitwise NOT
        System.out.println("~a: " + (~a) + " (binary: " + Integer.toBinaryString(~a) + ")");
        
        // Left shift
        System.out.println("a << 1: " + (a << 1) + " (binary: " + Integer.toBinaryString(a << 1) + ")");
        
        // Right shift
        System.out.println("a >> 1: " + (a >> 1) + " (binary: " + Integer.toBinaryString(a >> 1) + ")");
    }
}