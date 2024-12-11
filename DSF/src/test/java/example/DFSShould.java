package example;

import org.example.DFS;
import org.example.Console;
import org.example.StringNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.inOrder;

public class DFSShould {

    private DFS DFS;
    private Console console;

    @BeforeEach
    void setUp() {
        this.console = Mockito.mock(Console.class);
        this.DFS = new DFS(console);
    }

    @Test
    @DisplayName("Show client feedback if node cannot be instantiated because of no value")
    public void showClientFeedbackIfNodeCannotBeInstantiatedBecauseOfNullValue() {
        Exception exception = assertThrows(NullPointerException.class, () -> {
            new StringNode(null, "root");

        });
        assertEquals("Value cannot be null", exception.getMessage());
    }

    @Test
    @DisplayName("Show client feedback if node cannot be instantiated because of no name")
    public void showClientFeedbackIfNodeCannotBeInstantiatedBecauseOfNullName() {
        Exception exception = assertThrows(NullPointerException.class, () -> {
            new StringNode("value", null);

        });
        assertEquals("Name cannot be null", exception.getMessage());
    }


    @Test
    @DisplayName("find search term using DFS")
    void findSearchTermUsingDfs() {
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

        final String result = this.DFS.search(tree, "SPOT");

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

        final String result = this.DFS.search(tree, "SPOT");

        assertEquals("NOT FOUND", result);
    }

    @Test
    @DisplayName("should look for nodes respecting DFS order")
    public void shouldLookForNodesRespectingDfsOrder() {
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

        this.DFS.search(tree, "SPOT");

        InOrder inOrder = inOrder(console);
        inOrder.verify(console).soutNode(tree);
        inOrder.verify(console).soutNode(node1);
        inOrder.verify(console).soutNode(node3);
        inOrder.verify(console).soutNode(node7);
        inOrder.verify(console).soutNode(node8);
        inOrder.verify(console).soutNode(node9);
        inOrder.verify(console).soutNode(node4);
        inOrder.verify(console).soutNode(node2);
        inOrder.verify(console).soutNode(node5);
        inOrder.verify(console).soutNode(node6);

    }
}
