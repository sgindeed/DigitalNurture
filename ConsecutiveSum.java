import java.util.ArrayList;
import java.util.List;

public class ConsecutiveSumSequences {
    public static List<List<Integer>> findConsecutiveSequences(int N) {
        List<List<Integer>> result = new ArrayList<>();

        // Start from length 2 upwards
        for (int length = 2; length * (length + 1) / 2 <= N; length++) {
            double a = (2.0 * N / length - length + 1) / 2;
            if (a == (int) a) {
                List<Integer> sequence = new ArrayList<>();
                for (int i = 0; i < length; i++) {
                    sequence.add((int) a + i);
                }
                result.add(sequence);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int N = 15;  // Example input
        List<List<Integer>> sequences = findConsecutiveSequences(N);
        for (List<Integer> sequence : sequences) {
            System.out.println(sequence);
        }
    }
}
