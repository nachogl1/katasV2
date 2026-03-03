import java.util.ArrayList;
import java.util.List;

public class SolutionInOrder {
    public static String traverse(Node tree) {
        return dfsRecursion(tree, new ArrayList<>());
    }

    private static String dfsRecursion(Node node, List<String> history) {
        if (node != null) {
            if (node.getLeftNode() == null) {
                history.add(node.getValue());
            } else {
                dfsRecursion(node.getLeftNode(), history);
                history.add(node.getValue());
                dfsRecursion(node.getRightNode(), history);
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
                result =  dfsSearch(node.getLeftNode(), searchTerm);
            }
            if (searchTerm.equals(node.getValue())) {
                result = true;
            }
            System.out.println(node.getValue());

            return result ||  dfsSearch(node.getRightNode(), searchTerm);

        }

        return false;
    }

}

