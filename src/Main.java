import java.util.Scanner;

public class Main {

    // Memoization map to store previously calculated Fibonacci numbers
    private static long[] memo;

    // Recursive Fibonacci function with memoization
    public static long fibonacci(int n) {
        // Base cases
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        // Check if the Fibonacci value is already computed
        if (memo[n] != -1) {
            return memo[n];
        }

        // Recursive calculation and store the result in memo
        memo[n] = fibonacci(n - 1) + fibonacci(n - 2);
        return memo[n];
    }

    public static void main(String[] args) {
        // Create a scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a non-negative integer for the Fibonacci position: ");
        String input = scanner.nextLine();

        try {
            int position = Integer.parseInt(input);

            // Validate input (non-negative integer)
            if (position < 0) {
                System.out.println("Please enter a non-negative integer.");
            } else {
                // Initialize the memoization array
                memo = new long[position + 1];
                // Initialize memoization array with -1 (indicating uncalculated values)
                for (int i = 0; i <= position; i++) {
                    memo[i] = -1;
                }

                // Call the fibonacci function
                long result = fibonacci(position);
                System.out.println("The Fibonacci number at position " + position + " is " + result + ".");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid non-negative integer.");
        }
    }
}
