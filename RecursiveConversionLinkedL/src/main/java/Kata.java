public class Kata {

    public static String stringify(final CoolNode firstNode) {
        if (firstNode == null) {
            return "null";
        }

        return stringifyMe(firstNode, "");
    }

    private static String stringifyMe(CoolNode node, String result) {
        result = result.concat(node.getData() + " -> ");

        if (node.getNext() != null) {
            return stringifyMe(node.getNext(), result);
        }

        return result.concat("null");
    }


}
