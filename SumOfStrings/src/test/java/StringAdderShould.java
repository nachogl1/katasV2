import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringAdderShould {


    @ParameterizedTest
    @CsvSource({"1,1,2", "23,1,24", "300,800,1100", "1000000,1000000,2000000", "0,0,0", "001,002,3"})
    public void sum1plus1(String str1, String str2, double expected) {
        StringAdder adder = new StringAdder();

        double result = adder.add(str1, str2);

        assertEquals(expected, result);
    }

}
