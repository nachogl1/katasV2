import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KataShould {

    @Test
    public void transformNullIntoString() {
        String result = Kata.stringify(null);
        Assertions.assertEquals("null",result);
    }

    @Test
    public void transform1NodeIntoString() {
        CoolNode node = new CoolNode(1);
        String result = Kata.stringify(node);
        Assertions.assertEquals("1 -> null",result);
    }


    @Test
    public void transform5NodesIntoString() {
        CoolNode firstNode = new CoolNode(1, new CoolNode(2,new CoolNode(3,new CoolNode(4, new CoolNode(5)))));
        String result = Kata.stringify(firstNode);
        Assertions.assertEquals("1 -> 2 -> 3 -> 4 -> 5 -> null",result);
    }
}
