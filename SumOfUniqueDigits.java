public class UniqueDigitsSum {
    public static int sumOfUniqueDigits(int n) {
        int[] digitCount = new int[10];
        int temp = n;
        
        // Count the occurrences of each digit
        while (temp > 0) {
            int digit = temp % 10;
            digitCount[digit]++;
            temp /= 10;
        }

        int sum = 0;
        // Sum the digits that appear exactly once
        for (int i = 0; i < 10; i++) {
            if (digitCount[i] == 1) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfUniqueDigits(292));  // Output: 9
        System.out.println(sumOfUniqueDigits(1015)); // Output: 6
        System.out.println(sumOfUniqueDigits(108));  // Output: 9
        System.out.println(sumOfUniqueDigits(22));   // Output: 0
    }
}
