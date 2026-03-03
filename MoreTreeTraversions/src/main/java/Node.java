public class Node {
    private Node righNode;
    private Node leftNode;
    private String value;

    public Node(Node leftNode, Node righNode, String value) {
        this.righNode = righNode;
        this.leftNode = leftNode;
        this.value = value;
    }

    public Node(String value) {
        this.value = value;
    }

    public Node getRightNode() {
        return righNode;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public String getValue() {
        return value;
    }
}
