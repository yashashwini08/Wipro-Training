// 34.	Program to check whether a given no is positive.   
// 35.	Program to check whether a given no is positive or negative.
// // 36.	Program to check whether a given no is positive, negative or zero using ternary.
class povorneg {
    public static void main(String[] args) {
        int number = 5; // Example number

        // Check if the number is positive
        // if (number > 0) {
        //     System.out.println(number + " is a positive number.");
        // } else if (number < 0) {
        //     System.out.println(number + " is a negative number.");
        // } else {
        //     System.out.println("The number is zero.");

        
        System.out.println(number + (number > 0 ? " is a positive number." : 
                                           number < 0 ? " is a negative number." : 
                                           " is zero."));
        
    }
}

