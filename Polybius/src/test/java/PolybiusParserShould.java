import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PolybiusParserShould {

    @ParameterizedTest
    @CsvSource({"A,11", "B,12", "IJ,2424", "CODEWARS, 1334141552114243", "POLYBIUS SQUARE CIPHER,3534315412244543 434145114215 132435231542", "OS JTCRG HXFN GEYHRH, 3443 2444134222 23532133 221554234223"})
    public void return11ForA(String input, String expected) {
        Assertions.assertEquals(expected, PolybiusParser.polybius(input));
    }
}
