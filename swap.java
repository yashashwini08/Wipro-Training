// 8.	Program to swap two numbers using temporary variable.
// 9.	Program to swap two numbers without using temporary variable.
// 10.	Program to swap two numbers using bitwise operators.
// program to swap two decimal numbers using a temporary variable.
// Program to swap two characters using a temporary variable.
class swap {
    public static void main(String[] args) {
        // int a = 5, b = 10;
        
        // // Using temporary variable
        // System.out.println("Before swapping: a = " + a + ", b = " + b);
        // int temp = a;
        // a = b;
        // b = temp;
        // System.out.println("After swapping using temporary variable: a = " + a + ", b = " + b);
        
        // // Swapping back to original values
        // double c = 15.5, d = 20.5;
        // // Using temporary variable for decimal numbers
        // System.out.println("Before swapping decimal: c = " + c + ", d = " + d);
        // double tempDecimal = c; 
        // c = d;
        // d = tempDecimal;
        // System.out.println("After swapping decimal using temporary variable: c = " + c + ", d = " + d);

        // // // Swapping back to original values
        // char x = 'A', y = 'B';
        // // // Using temporary variable for characters
        // System.out.println("Before swapping characters: x = " + x + ", y = " + y);
        // char tempChar = x;      
        // x = y;
        // y = tempChar;
        // System.out.println("After swapping characters using temporary variable: x = " + x + ", y = " + y);

        // program to swap two strings using a temporary variable.
        String str1 = "Hello", str2 = "World";
        System.out.println("Before swapping strings: str1 = " + str1 + ", str2 = " + str2);
        String tempStr = str1;   
        str1 = str2;
        str2 = tempStr;
        System.out.println("After swapping strings using temporary variable: str1 = " + str1 + ", str2 = " + str2);

        // // Swapping back to original values
        // a = 5; 
        // b = 10;

        // // Without using temporary variable
        // System.out.println("Before swapping: a = " + a + ", b = " + b);
        // a = a + b; // Now a is 15
        // b = a - b; // Now b is 5
        // a = a - b; // Now a is 10
        // System.out.println("After swapping without temporary variable: a = " + a + ", b = " + b);
        
        // // Swapping back to original values
        // a = 5; 
        // b = 10;

        // // Using bitwise operators
        // System.out.println("Before swapping: a = " + a + ", b = " + b);
        // a = a ^ b; // Now a is 15 (binary 1111)
        // b = a ^ b; // Now b is 5 (binary 0101)
        // a = a ^ b; // Now a is 10 (binary 1010)
        // System.out.println("After swapping using bitwise operators: a = " + a + ", b = " + b);
    }
}