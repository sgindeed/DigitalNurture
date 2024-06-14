public class DigitalLockPinGenerator {
    public static int generatePIN(int input1, int input2, int input3) {
        // Extract units, tens, and hundreds digits from each input
        int units1 = input1 % 10;
        int units2 = input2 % 10;
        int units3 = input3 % 10;
        
        int tens1 = (input1 / 10) % 10;
        int tens2 = (input2 / 10) % 10;
        int tens3 = (input3 / 10) % 10;
        
        int hundreds1 = (input1 / 100) % 10;
        int hundreds2 = (input2 / 100) % 10;
        int hundreds3 = (input3 / 100) % 10;
        
        // Find the least units, tens, and hundreds positions
        int leastUnits = Math.min(units1, Math.min(units2, units3));
        int leastTens = Math.min(tens1, Math.min(tens2, tens3));
        int leastHundreds = Math.min(hundreds1, Math.min(hundreds2, hundreds3));
        
        // Find the maximum of all digits in the three input numbers
        int maxDigit = Math.max(Math.max(units1, tens1), Math.max(hundreds1, Math.max(units2, Math.max(tens2, Math.max(hundreds2, Math.max(units3, Math.max(tens3, hundreds3)))))));
        
        // Construct the PIN
        int pin = maxDigit * 1000 + leastHundreds * 100 + leastTens * 10 + leastUnits;
        return pin;
    }

    public static void main(String[] args) {
        // Example inputs
        int input1 = 352;
        int input2 = 794;
        int input3 = 861;

        int pin = generatePIN(input1, input2, input3);
        System.out.println("Generated PIN: " + pin); // Expected output for the example: 9861
    }
}
