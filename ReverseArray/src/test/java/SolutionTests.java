import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTests {


    @Test
    void reverseArray() {
        char[] expected = {'h', 'o', 'l', 'a'};
        char[] input = {'a', 'l', 'o', 'h'};
        Assertions.assertArrayEquals(expected, Solution.reverse(input));
    }

}
