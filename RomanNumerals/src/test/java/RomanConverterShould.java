import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanConverterShould {

    private RomanConverter converter;

    @BeforeEach
    void setUp() {
        this.converter = new RomanConverter();

    }


    @ParameterizedTest
    @MethodSource("getTestNumbers")
    void convertNumbers(int input, String expected) {
        assertEquals(expected, converter.convert(input));
    }

    private static Stream<Arguments> getTestNumbers() {
        return Stream.of(
                Arguments.of(1, "I"),
                Arguments.of(2, "II"),
                Arguments.of(3, "III"),
                Arguments.of(4, "IV"),
                Arguments.of(5, "V"),
                Arguments.of(6, "VI"),
                Arguments.of(7, "VII"),
                Arguments.of(8, "VIII"),
                Arguments.of(9, "IX"),
                Arguments.of(10, "X"),
                Arguments.of(11, "XI"),
                Arguments.of(12, "XII"),
                Arguments.of(13, "XIII"),
                Arguments.of(14, "XIV"),
                Arguments.of(15, "XV"),
                Arguments.of(16, "XVI"),
                Arguments.of(17, "XVII"),
                Arguments.of(18, "XVIII"),
                Arguments.of(19, "XIX"),
                Arguments.of(20, "XX"),
                Arguments.of(21, "XXI"),
                Arguments.of(22, "XXII"),
                Arguments.of(23, "XXIII"),
                Arguments.of(24, "XXIV"),
                Arguments.of(25, "XXV"),
                Arguments.of(26, "XXVI"),
                Arguments.of(27, "XXVII"),
                Arguments.of(28, "XXVIII"),
                Arguments.of(29, "XXIX"),
                Arguments.of(30, "XXX"),
                Arguments.of(31, "XXXI"),
                Arguments.of(32, "XXXII"),
                Arguments.of(33, "XXXIII"),
                Arguments.of(34, "XXXIV"),
                Arguments.of(35, "XXXV"),
                Arguments.of(36, "XXXVI"),
                Arguments.of(37, "XXXVII"),
                Arguments.of(38, "XXXVIII"),
                Arguments.of(39, "XXXIX"),
                Arguments.of(40, "XL"),
                Arguments.of(41, "XLI"),
                Arguments.of(60, "LX"),
                Arguments.of(70, "LXX"),
                Arguments.of(80, "LXXX"),
                Arguments.of(90, "XC"),
                Arguments.of(294, "CCXCIV"),
                Arguments.of(2019, "MMXIX"),
                Arguments.of(900, "CM"),
                Arguments.of(2687, "MMDCLXXXVII"),
                Arguments.of(3499, "MMMCDXCIX")

        );
    }

}
