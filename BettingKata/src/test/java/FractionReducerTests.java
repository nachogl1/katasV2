import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static java.util.AbstractMap.SimpleEntry;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionReducerTests {

    @ParameterizedTest
    @CsvSource({"45,120,3,8", "18,24,3,4"})
    void reduceFractionOf(int numerator, int denominator, int fractionedNumerator, int fractionedDenominator) {
        SimpleEntry<Integer, Integer> expected = new SimpleEntry<>(fractionedNumerator, fractionedDenominator);
        assertEquals(expected, FractionReducer.reduce(new SimpleEntry<>(numerator, denominator)));
    }
}
