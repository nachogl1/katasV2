import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.List;

public class SolutionShould {
    @ParameterizedTest
    @CsvSource({"a,b", "b,c", "y,z", "z,' '"})
    public void permutateLetterForward(String input, String expected) {
        Assertions.assertEquals(expected, Solution.permutateLetterForward(input));
    }

    @ParameterizedTest
    @CsvSource({"a,' '", "b,a", "y,x", "z,y"})
    public void permutateLetterBackwards(String input, String expected) {
        Assertions.assertEquals(expected, Solution.permutateLetterBackwards(input));
    }

    @Test
    public void returnAllForwardCombinationsForAWord() {
        List<String> resultAsList = Arrays.asList(Solution.getAllForwardPermutations("adfa"));
        List<String> expectedList = Arrays.asList("begb", "beeb", "bcgb", "bceb");
        Assertions.assertTrue(resultAsList.containsAll(expectedList));

    }


}
