import java.util.Scanner;

class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three boolean values
        System.out.print("Enter first boolean value (true/false): ");
        boolean a = sc.nextBoolean();
        System.out.print("Enter second boolean value (true/false): ");
        boolean b = sc.nextBoolean();
        System.out.print("Enter third boolean value (true/false): ");
        boolean c = sc.nextBoolean();

        // Check if at least two values are true
        boolean result = (a && b) || (b && c) || (a && c);

        // Output the result
        System.out.println("At least two values are true: " + result);

        sc.close();
}
    }
    
