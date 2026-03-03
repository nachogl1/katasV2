import java.util.ArrayList;
import java.util.List;

public class SolutionPreOrder {
    public static String traverse(Node tree) {
        return dfsRecursion(tree, new ArrayList<>());
    }

    private static String dfsRecursion(Node node, List<String> history) {
        if (node != null) {
            history.add(node.getValue());
            if (node.getLeftNode() != null) dfsRecursion(node.getLeftNode(), history);
            if (node.getRightNode() != null) dfsRecursion(node.getRightNode(), history);
        }
        return history.toString();
    }

    public static boolean search(Node tree, String searchTerm) {
        return dfsSearch(tree, searchTerm);
    }

    private static boolean dfsSearch(Node node, String searchTerm) {
        if (node != null) {

            System.out.println(node.getValue());
            if (searchTerm.equals(node.getValue())) return true;

            return dfsSearch(node.getLeftNode(), searchTerm) || dfsSearch(node.getRightNode(), searchTerm);
        }

        return false;
    }
}
