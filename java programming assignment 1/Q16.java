class Q16 {
    public static void main(String[] args) {
        int number = 17; // Input number
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; // Found a divisor, not prime
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("The number " + number + " is Prime");
        } else {
            System.out.println("The number " + number + " is not Prime");
        }
    }
}
