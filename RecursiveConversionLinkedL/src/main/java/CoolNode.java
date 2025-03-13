public class CoolNode {
    private int data;
    private CoolNode next;

    public CoolNode(int data, CoolNode next) {
        this.data = data;
        this.next = next;
    }

    public CoolNode(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public CoolNode getNext() {
        return next;
    }
}