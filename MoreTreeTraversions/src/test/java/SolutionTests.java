import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SolutionTests {

    //I know the main code is super refactorizable, but I will leave this open. If I refactor, I cannot read how I design it in the beginning and that is quite revelling.


    private final Node tree3Nodes = new Node(new Node("b"), new Node("c"), "a");
    private final Node tree7Nodes = new Node(new Node(new Node("d"), new Node("f"), "b"), new Node(new Node("g"), new Node("h"), "c"), "a");

    @Test
    void preOrderTree3() {
        Assertions.assertEquals("[a, b, c]", SolutionPreOrder.traverse(tree3Nodes));
    }

    @ParameterizedTest
    @CsvSource({"a,true", "b, true", "c,true", "m, false"})
    void preOrderTree3Search(String input, boolean expected) {
        Assertions.assertEquals(expected,SolutionPreOrder.search(tree3Nodes, input));
    }

    @Test
    void preOrderTree7() {
        Assertions.assertEquals("[a, b, d, f, c, g, h]", SolutionPreOrder.traverse(tree7Nodes));
    }

    @ParameterizedTest
    @CsvSource({"a,true", "b, true", "c,true", "m, false", "h, true", "f,true", "yo, false"})
    void preOrderTree7Search(String input, boolean expected) {
        Assertions.assertEquals(expected,SolutionPreOrder.search(tree7Nodes, input));
    }

    @Test
    void inOrderTree3() {
        Assertions.assertEquals("[b, a, c]", SolutionInOrder.traverse(tree3Nodes));
    }

    @ParameterizedTest
    @CsvSource({"a,true", "b, true", "c,true", "m, false"})
    void inOrderTree3Search(String input, boolean expected) {
        Assertions.assertEquals(expected,SolutionInOrder.search(tree3Nodes, input));
    }

    @ParameterizedTest
    @CsvSource({"a, true", "b, true", "c, true", "m, false", "h, true", "f,true", "yo, false"})
    void inOrderTree7Search(String input, boolean expected) {
        Assertions.assertEquals(expected,SolutionInOrder.search(tree7Nodes, input));
    }


    @Test
    void inOrderTree7() {
        Assertions.assertEquals("[d, b, f, a, g, c, h]", SolutionInOrder.traverse(tree7Nodes));
    }

    @Test
    void postOrderTree3() {
        Assertions.assertEquals("[b, c, a]", SolutionPostOrder.traverse(tree3Nodes));
    }

    @Test
    void postOrderTree7() {
        Assertions.assertEquals("[d, f, b, g, h, c, a]", SolutionPostOrder.traverse(tree7Nodes));
    }

    @ParameterizedTest
    @CsvSource({"a,true", "b, true", "c,true", "m, false"})
    void postOrderTree3Search(String input, boolean expected) {
        Assertions.assertEquals(expected,SolutionPostOrder.search(tree3Nodes, input));
    }

    @ParameterizedTest
    @CsvSource({"a, true", "b, true", "c, true", "m, false", "h, true", "f,true", "yo, false"})
    void postOrderTree7Search(String input, boolean expected) {
        Assertions.assertEquals(expected,SolutionPostOrder.search(tree7Nodes, input));
    }
}
