// Program to demonstrate logical operators using ternary operator.
public class logical {
    public static void main(String[] args) {
        // boolean x = true, y = false;
        int x = 1, y = 0;
        // System.out.println("x AND y: " + (x && y));
        // System.out.println("x OR y: " + (x || y));
        // System.out.println("NOT x: " + (!x));
        // System.out.println("NOT y: " + (!y));

        System.out.println("x AND y: " + ((x != 0) && (y != 0) ? "true" : "false"));
        System.out.println("x OR y: " + ((x != 0) || (y != 0) ? "true" : "false"));
        System.out.println("NOT x: " + ((x == 0) ? "true" : "false"));
        System.out.println("NOT y: " + ((y == 0) ? "true" : "false"));
    }
}
