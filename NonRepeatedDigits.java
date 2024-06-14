public class NonRepeatedDigits {
    public static int countNonRepeatedDigits(int N) {
        // Array to store the count of each digit (0-9)
        int[] digitCount = new int[10];
        
        // Convert the number to string to easily iterate over each digit
        String number = Integer.toString(N);
        
        // Count the occurrences of each digit
        for (int i = 0; i < number.length(); i++) {
            char digitChar = number.charAt(i);
            int digit = digitChar - '0'; // Convert char to int
            digitCount[digit]++;
        }
        
        // Count the number of digits that appear exactly once
        int nonRepeatedCount = 0;
        for (int count : digitCount) {
            if (count == 1) {
                nonRepeatedCount++;
            }
        }
        
        return nonRepeatedCount;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(countNonRepeatedDigits(292));  // Output: 1
        System.out.println(countNonRepeatedDigits(1015)); // Output: 2
        System.out.println(countNonRepeatedDigits(108));  // Output: 3
    }
}
