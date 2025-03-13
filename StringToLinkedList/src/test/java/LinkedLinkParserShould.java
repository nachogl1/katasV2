import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedLinkParserShould {

    @Test
    public void parseNull() {
        Assertions.assertNull(LLparser.parse("null"));
    }

    @Test
    public void parseForOneNode() {
        Assertions.assertEquals(new Node(1), LLparser.parse("1 -> null"));
    }

    @Test
    public void parseForTwoNode() {
        Assertions.assertEquals(new Node(1, new Node(2)), LLparser.parse("1 -> 2 -> null"));
    }

    @Test
    public void parseForFiveNode() {
        Assertions.assertEquals(new Node(1, new Node(2, new Node(3, new Node(4, new Node(5))))),
                LLparser.parse("1 -> 2 -> 3 -> 4 -> 5 -> null"));
    }
}
