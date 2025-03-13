import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringCheckerShould {

    @ParameterizedTest
    @CsvSource({"abcd,cd", "abcda,cda", "sidhuyfucdgc7ooa,ooa"})
    void checkEndingOfStringPositive(String str1, String str2) {
        StringChecker checker = new StringChecker();
        boolean result = checker.check(str1, str2);
        assertTrue(result);
    }

    @ParameterizedTest
    @CsvSource({"abcd,cd1", "abcda,cda1", "sidhuyfucdgc7ooa,ooa1"})
    void checkEndingOfStringFalse(String str1, String str2) {
        StringChecker checker = new StringChecker();
        boolean result = checker.check(str1, str2);
        assertFalse(result);
    }

}
