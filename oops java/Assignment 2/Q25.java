class Q25 {
    public static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10; 
            n /= 10; 
        }
        return rev;
    }

    public static void main(String[] args) {
        int n = 12345;  
        System.out.println(reverse(n));
    }

}
