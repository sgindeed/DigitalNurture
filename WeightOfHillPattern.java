public class StarPattern {
    public static void printStarPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 6;  // You can change this value to print the pattern for different levels
        printStarPattern(N);
    }
}
