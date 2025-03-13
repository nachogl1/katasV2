import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StringMergeShould {

    @ParameterizedTest
    @CsvSource({"ba,ac,a,bac", "hello,world,l,held", "coding, anywhere,n, codinywhere", "wonderful, people, e, wondeople"})
    public void returnAWord(String word1, String word2, String connector, String expected) {
        StringMerge merger = new StringMerge();
        Assertions.assertEquals(expected, merger.merge(word1, word2, connector));
    }
}
