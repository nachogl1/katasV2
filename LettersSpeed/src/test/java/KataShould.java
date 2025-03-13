import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KataShould {

    @Test
    public void pushAZeroSlots() {
        Assertions.assertEquals("A", Kata.parse("A"));
    }

    @Test
    public void pushB1Slots() {
        Assertions.assertEquals(" B", Kata.parse("B"));
    }

    @Test
    public void pushRandomSequence() {
        Assertions.assertEquals("     E H    DLL   OLO   R  W", Kata.parse("HELLOWORLD"));
    }
}
