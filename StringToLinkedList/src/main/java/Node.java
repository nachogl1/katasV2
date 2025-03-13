import java.util.Objects;

public final class Node {
    public final int data;
    public Node next;
    public Node(int data) {
        this(data, null);
    }
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return data == node.data && Objects.equals(next, node.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, next);
    }


}