class Q15 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the triangle

    for (int i = 1; i <= rows; i++) {
        // Print spaces
        for (int j = rows; j > i; j--) {
            System.out.print(" ");
        }
        // Print asterisks
        for (int k = 1; k <= i; k++) {
            System.out.print("* ");
        }
        // Move to the next line
        System.out.println();
    }
    }
    
}
