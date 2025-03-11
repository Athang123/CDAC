class Q13 {
    public static void main(String[] args) {
        int num = -5;
        
        int a = num >> 31;
        int abs = (num + a) ^ a;
        
        System.out.println("Absolute value: " + abs);
    }

}
