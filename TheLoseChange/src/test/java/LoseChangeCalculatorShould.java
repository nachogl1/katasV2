import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoseChangeCalculatorShould {

    private LoseChangeCalculator calculator;

    @BeforeEach
    void setUp() {
        this.calculator = new LoseChangeCalculator();
    }

    @ParameterizedTest
    @CsvSource({"-56", "0"})
    public void returnEmptyMapWhenOutsideOfRange(int input) {

        Map<String, Integer> result = this.calculator.calculate(input);
        assertEquals(getMapFor(0, 0, 0, 0), result);
    }

    @Test
    public void returnChangeFor1() {
        Map<String, Integer> result = this.calculator.calculate(1);
        assertEquals(getMapFor(0, 1, 0, 0), result);
    }

    @Test
    public void returnChangeFor2() {
        Map<String, Integer> result = this.calculator.calculate(2);
        assertEquals(getMapFor(0, 2, 0, 0), result);
    }

    private Map<String, Integer> getMapFor(int nickels, int pennies, int dimes, int quarters) {
        return Map.of(
                "NICKELS", nickels,
                "PENNIES", pennies,
                "DIMES", dimes,
                "QUARTERS", quarters
        );
    }

}
