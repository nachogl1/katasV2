import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BFSShould {

    @Test
    @DisplayName("Show client feedback if node cannot be instantiated because of no value")
    public void showClientFeedbackIfNodeCannotBeInstantiatedBecauseOfNullValue() {
        Exception exception = assertThrows(NullPointerException.class, () -> {
            StringNode tree = new StringNode(null, "root");

        });
        assertEquals("Value cannot be null", exception.getMessage());
    }

    @Test
    @DisplayName("Show client feedback if node cannot be instantiated because of no name")
    public void showClientFeedbackIfNodeCannotBeInstantiatedBecauseOfNullName() {
        Exception exception = assertThrows(NullPointerException.class, () -> {
            StringNode tree = new StringNode("value", null);

        });
        assertEquals("Name cannot be null", exception.getMessage());
    }


    @Test
    @DisplayName("find search term using main.BFS")
    void findSearchTermUsingBfs() {
        StringNode tree = new StringNode("I am root", "root");
        StringNode node1 = new StringNode("node1", "node1");
        StringNode node2 = new StringNode("node2", "node2");
        StringNode node3 = new StringNode("node3", "node3");
        StringNode node4 = new StringNode("node4", "node4");
        StringNode node5 = new StringNode("SPOT", "node5");
        StringNode node6 = new StringNode("node6", "node6");
        StringNode node7 = new StringNode("node7", "node7");
        StringNode node8 = new StringNode("node8", "node8");
        StringNode node9 = new StringNode("node9", "node9");


        tree.setLeftNode(node1);
        tree.setRightNode(node2);

        node1.setLeftNode(node3);
        node1.setRightNode(node4);

        node3.setLeftNode(node7);
        node7.setRightNode(node8);
        node8.setLeftNode(node9);

        node2.setLeftNode(node5);
        node2.setRightNode(node6);

        final String result = BFS.search(tree, "SPOT");

        assertEquals("node5", result);
    }

    @Test
    @DisplayName("Show user message if not found")
    void showUserMessageIfNotFound() {
        StringNode tree = new StringNode("I am root", "root");
        StringNode node1 = new StringNode("node1", "node1");
        StringNode node2 = new StringNode("node2", "node2");
        StringNode node3 = new StringNode("node3", "node3");
        StringNode node4 = new StringNode("node4", "node4");
        StringNode node5 = new StringNode("node5", "node5");
        StringNode node6 = new StringNode("node6", "node6");
        StringNode node7 = new StringNode("node7", "node7");
        StringNode node8 = new StringNode("node8", "node8");
        StringNode node9 = new StringNode("node9", "node9");


        tree.setLeftNode(node1);
        tree.setRightNode(node2);

        node1.setLeftNode(node3);
        node1.setRightNode(node4);

        node3.setLeftNode(node7);
        node7.setRightNode(node8);
        node8.setLeftNode(node9);

        node2.setLeftNode(node5);
        node2.setRightNode(node6);

        final String result = BFS.search(tree, "SPOT");

        assertEquals("NOT FOUND", result);
    }
}
