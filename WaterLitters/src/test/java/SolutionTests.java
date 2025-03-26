import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SolutionTests {

    @ParameterizedTest
    @CsvSource({"3,1", "6.7,3", "11.8, 5"})
    void returnLitterPerTime(float time, int expected) {

        Assertions.assertEquals(expected, Solution.solve(time));
    }
}
