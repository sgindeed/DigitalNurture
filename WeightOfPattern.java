public class HillPatternWeight {
    public static int calculateTotalWeight(int totalLevels, int headLevelWeight, int weightIncrement) {
        int totalWeight = 0;
        int currentLevelWeight = headLevelWeight;

        for (int i = 1; i <= totalLevels; i++) {
            totalWeight += i * currentLevelWeight;
            currentLevelWeight += weightIncrement;
        }

        return totalWeight;
    }

    public static void main(String[] args) {
        int totalLevels = 5;       // Example: 5 levels
        int headLevelWeight = 2;   // Example: head level weight is 2
        int weightIncrement = 3;   // Example: each level increments by 3

        int result = calculateTotalWeight(totalLevels, headLevelWeight, weightIncrement);
        System.out.println("Total weight of the hill pattern: " + result); // Expected Output: 95
    }
}
