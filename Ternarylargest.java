// Write a program to find largest of two no’s using Ternary operator.
public class Ternarylargest {
    public static void main(String[] args) {
        int a = 10, b = 20 ,c = 15, d = 25;
        // int largest = (a > b) ? a : b;
        // largest = (largest > c) ? largest : c;
        // largest = (largest > d) ? largest : d;
        // int n1 = 10, n2 = 20, n3 = 15, n4 = 25;
        // int max;
        // max = (n1 > n2 && n1 > n3 && n1 > n4) ?
        //        n1 : ((n2 > n3 && n2 > n4) ?
        //        n2 : (n3 > n4 ? n3 : n4));

        int largest = Math.max((a > b ? a : b), (c > d ? c : d));
        System.out.println("The largest number is: " + largest);
        // System.out.println("The largest number is: " + max);

    }
}