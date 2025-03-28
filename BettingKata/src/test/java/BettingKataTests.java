import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class BettingKataTests {


    @ParameterizedTest
    @MethodSource("provideTestCases")
    public void testTrueOddsCalculation(List<int[]> inputOdds, List<int[]> expectedOutput) {
        List<int[]> result = BettingKata.calculateTrueOdds(inputOdds);

        for (int i = 0; i < result.size(); i++) {
            Assertions.assertArrayEquals(expectedOutput.get(i), result.get(i),
                    "Failed for input: " + arrayToString(inputOdds) +
                            "\nExpected: " + arrayToString(expectedOutput) +
                            "\nBut got: " + arrayToString(result));
        }
    }

    // Method to provide test cases (inputs and expected outputs)
    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(
                        List.of(new int[]{3, 5}, new int[]{7, 5}, new int[]{19, 5}),
                        List.of(new int[]{1, 1}, new int[]{2, 1}, new int[]{5, 1})
                ),
                Arguments.of(
                        List.of(new int[]{4, 6}, new int[]{6, 4}, new int[]{4, 1}),
                        List.of(new int[]{1, 1}, new int[]{2, 1}, new int[]{5, 1})
                ),
                Arguments.of(
                        List.of(new int[]{5, 30}, new int[]{29, 6}, new int[]{29, 6}),
                        List.of(new int[]{2, 5}, new int[]{6, 1}, new int[]{6, 1})
                ),
                Arguments.of(
                        List.of(new int[]{3, 1}, new int[]{3, 1}, new int[]{4, 1}),
                        List.of(new int[]{9, 5}, new int[]{9, 5}, new int[]{5, 2})
                )
        );
    }

    // Helper method to convert 2D array to string for better error reporting
    private String arrayToString(List<int[]> array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int[] row : array) {
            sb.append("[");
            for (int val : row) {
                sb.append(val).append(",");
            }
            sb.deleteCharAt(sb.length() - 1); // remove trailing comma
            sb.append("], ");
        }
        if (sb.length() > 1) {
            sb.delete(sb.length() - 2, sb.length()); // remove trailing comma and space
        }
        sb.append("]");
        return sb.toString();
    }
}

