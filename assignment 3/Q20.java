 class Q20 {
    public static void main(String[] args) {
        int num = 5;
        for (int i = num; i >= 1; i--) {
            for (int j = num; j >= i; j--) {
                System.out.print(j);
                if (j > i) {
                    System.out.print("*"); // Just a separator, not multiplication
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}
