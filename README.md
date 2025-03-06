# Module_4_-_Fibonacci_Finder
Explanation:
Base Cases: The Fibonacci sequence starts with 0 and 1 at positions 0 and 1 respectively, so we handle these as base cases in the recursive function.


Recursive Fibonacci with Memoization:

The function fibonacci(int n) calculates the Fibonacci number at position n. It uses memoization to store the results of previously computed Fibonacci numbers, avoiding redundant calculations.
If a value for n has already been computed (i.e., memo[n] != -1), it simply returns the cached value.
Otherwise, it recursively calculates the Fibonacci value, stores it in the memo array, and then returns it.
Input Validation:

The program prompts the user for a non-negative integer and checks whether the input is valid.
If the user enters an invalid value (e.g., negative number or non-numeric input), an error message is displayed.
Memoization:

The memoization array (memo) is used to store previously calculated Fibonacci numbers. This significantly improves the performance of the program by reducing the number of recursive calls.
Bonus Challenge: Memoization improves the efficiency of the program, especially for large Fibonacci numbers. Without memoization, the program would make many redundant recursive calls. Memoization helps store and reuse previously computed results, which greatly speeds up the process.

Example Output:
For an input of 5:
Enter a non-negative integer for the Fibonacci position: 5
The Fibonacci number at position 5 is 5.

For an input of 10:
Enter a non-negative integer for the Fibonacci position: 10
The Fibonacci number at position 10 is 55.

For invalid input:
Enter a non-negative integer for the Fibonacci position: -5
Please enter a non-negative integer.

This program meets the assignment's requirements and ensures efficient calculation using memoization.
