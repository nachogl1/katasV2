import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class LLparser {
    public static Node parse(String strInput) {

        if (strInput.equals("null")) {
            return null;
        }

        String[] array = strInput.split("->");
        array = Arrays.copyOf(array, array.length - 1);
        final List<Integer> intList = Arrays.stream(array)
                .map(String::trim)
                .map(Integer::valueOf).toList();
        Queue<Integer> queue = new ArrayDeque<>(intList);

        return recursiveMagicPlease(new Node(queue.poll()), queue);
    }

    private static Node recursiveMagicPlease(Node node, Queue<Integer> queue) {
        if (!queue.isEmpty()) {
            node.next = new Node(queue.poll());
            recursiveMagicPlease(node.next, queue);
        }

        return node;
    }

}
