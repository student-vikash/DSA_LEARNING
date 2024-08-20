package dp_coding;

public class Fibonacci {
    // Function to calculate the nth Fibonacci number using dynamic programming
    public static int fibonacci(int n) {
        // Handle base cases
        if (n <= 1) {
            return n;
        }

        // Create an array to store Fibonacci numbers
        int[] fib = new int[n + 1];

        // Initialize the first two Fibonacci numbers
        fib[0] = 0; // F(0)
        fib[1] = 1; // F(1)

        // Build the Fibonacci array iteratively
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        // Return the nth Fibonacci number
        return fib[n];
    }



    // method for fibonacci series
    public static void fibonacciSeries(int n)
    {
        if(n <= 1)
            System.out.println(0+" "+n);

        int a=0,b=1,c=0;
        for(int i=2;i<=n;i++)
        {
            System.out.print(a+" ");
            c = a + b;
            a = b;
            b = c;
        }
    }

    // Main method to test the fibonacci function
    public static void main(String[] args) {
//        int n = 10; // Change this value to compute a different Fibonacci number
//        int result = fibonacci(n);
//        System.out.println("Fibonacci number F(" + n + ") is: " + result);

        fibonacciSeries(10);
    }
}
