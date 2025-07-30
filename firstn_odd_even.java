class firstn_odd_even {
    public static void main(String[] args) {
        
        int odd_sum=0;
        int even_sum=0;

        for (int i = 1; i<=20; i++) {
            if (i % 2 != 0) { 
                odd_sum += i;
            } else { 
                even_sum += i; 
            }
        }
        System.out.println("Sum of first 20 odd numbers: " + odd_sum);
        System.out.println("Sum of first 20 even numbers: " + even_sum);
    }
}