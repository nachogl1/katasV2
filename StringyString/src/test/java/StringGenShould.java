import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringGenShould {

    private StringGen gen;

    @BeforeEach
    void setUp() {
        this.gen = new StringGen();
    }

    @ParameterizedTest
    @Disabled
    @CsvSource({"1,1", "2, 10", "3, 101", "4, 1010", "5, 10101", "6, 101010"})
    @DisplayName("generate strings with length 1 to 5")
    public void generate1To5(int stringLength, String expected) {
        String result = gen.generate(stringLength);
        assertEquals(expected, result);
    }
}
