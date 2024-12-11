
import java.util.ArrayDeque;
import java.util.Queue;

public class BFS {

    public static String search(StringNode root, String searchValue) {
        Queue<StringNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            StringNode currentNode = queue.remove();
            soutNode(currentNode);

            if (currentNode.getValue().equals(searchValue)) {
                soutSuccess(currentNode);
                return currentNode.getNodeName();
            } else {
                if (currentNode.getLeftNode() != null) {
                    queue.add(currentNode.getLeftNode());
                }
                if (currentNode.getRightNode() != null) {
                    queue.add(currentNode.getRightNode());
                }

            }

        }

        return "NOT FOUND";

    }

    private static void soutSuccess(StringNode root) {
        System.out.println(String.format("Found value \"%s\" at node \"%s\"", root.getValue(), root.getNodeName()));

    }

    private static void soutNode(StringNode root) {
        System.out.println(String.format("Visiting node  \"%s\"", root.getNodeName()));
    }
}
