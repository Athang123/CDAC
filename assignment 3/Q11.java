class Q11 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        //  pre-increment and post-decrement in a single expression
        int res = ++a + b--;
        
        System.out.println("Value of a after pre-increment: " + a); // a is now 11
        System.out.println("Value of b after post-decrement: " + b); // b is now 19
        System.out.println("Result of the expression: " + res); // result is 30
    }
}