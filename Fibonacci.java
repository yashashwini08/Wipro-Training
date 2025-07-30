public class Fibonacci {
    public static void main(String[] args) {
        int n = 15; // Number of terms to display
        int a = 0, b = 1;
        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}



// int n=5;
// public static int fibonacci(int n)
// {
//     if (n <= 1) {
//         return n;
//     }
//     return fibonacci(n - 1) + fibonacci(n - 2);
// }