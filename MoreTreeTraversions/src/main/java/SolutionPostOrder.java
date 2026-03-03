import java.util.ArrayList;
import java.util.List;

public class SolutionPostOrder {
    public static String traverse(Node tree) {
        return dfsRecursion(tree, new ArrayList<>());
    }

    private static String dfsRecursion(Node node, List<String> history) {
        if (node != null) {
            if (node.getLeftNode() == null) {
                history.add(node.getValue());
            } else {
                dfsRecursion(node.getLeftNode(), history);
                dfsRecursion(node.getRightNode(), history);
                history.add(node.getValue());
            }
        }
        return history.toString();
    }


    public static boolean search(Node tree, String searchTerm) {
        return dfsSearch(tree, searchTerm);
    }

    private static boolean dfsSearch(Node node, String searchTerm) {
        if (node != null) {
            boolean result = false;

            if (node.getLeftNode() != null) {
                result = result || dfsSearch(node.getLeftNode(), searchTerm);
            }

            if (node.getLeftNode() != null) {
                result = result || dfsSearch(node.getRightNode(), searchTerm);
            }

            if (searchTerm.equals(node.getValue())) {
                result = true;
            }

            System.out.println(node.getValue());

            return result;

        }

        return false;
    }
}
