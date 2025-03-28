import java.util.ArrayList;
import java.util.List;

public class BettingKata {

    // Method to calculate the greatest common divisor (GCD) using recursion
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // Method to normalize the fraction (a/b) by dividing both by their GCD
    private static int[] norm(int[] fraction) {
        int d = gcd(fraction[0], fraction[1]);
        return new int[]{fraction[0] / d, fraction[1] / d};
    }

    // Method to add two fractions (a/b) + (c/d)
    private static int[] add(int[] fraction1, int[] fraction2) {
        int a = fraction1[0], b = fraction1[1];
        int c = fraction2[0], d = fraction2[1];
        return norm(new int[]{a * d + b * c, b * d});
    }

    // Method to divide two fractions (a/b) / (c/d)
    private static int[] div(int[] fraction1, int[] fraction2) {
        int a = fraction1[0], b = fraction1[1];
        int c = fraction2[0], d = fraction2[1];
        return norm(new int[]{a * d, b * c});
    }

    // Method to calculate the odds of a fraction (a/b)
    private static int[] odds(int[] fraction) {
        return new int[]{fraction[1] - fraction[0], fraction[0]};
    }

    // Main method to compute true odds for a list of odds
    public static List<int[]> calculateTrueOdds(List<int[]> arr) {
        // Initial state of the sum (s) represented as a fraction
        int[] s = new int[]{0, 1};

        // Calculate the sum s using reduce-like behavior (accumulate fractions)
        for (int[] pair : arr) {
            s = add(s, new int[]{pair[1], pair[0] + pair[1]});
        }

        // Map each pair in arr to the corresponding odds
        List<int[]> result = new ArrayList<>();
        for (int[] pair : arr) {
            result.add(odds(div(new int[]{pair[1], pair[0] + pair[1]}, s)));
        }

        return result;
    }

}
