public class FibonacciSeries {
    public static int getFibonacciNumber(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("N must be a positive integer.");
        }
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }

        int a = 0;
        int b = 1;
        int fib = 0;

        for (int i = 3; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }

        return fib;
    }

    public static void main(String[] args) {
        int N = 10;  // Example input: 10th Fibonacci number
        int result = getFibonacciNumber(N);
        System.out.println("The " + N + "th Fibonacci number is: " + result); // Expected output: 34
    }
}
