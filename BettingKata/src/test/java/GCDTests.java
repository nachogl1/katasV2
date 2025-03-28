import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GCDTests {

    @ParameterizedTest
    @CsvSource({"45,120,15", "8,12,4", "64,48,16"})
    void calculateGCDOf(final int x, final int y, final int expected) {
        Assertions.assertEquals(expected, GCDCalculator.gcd(x, y));
    }
}
