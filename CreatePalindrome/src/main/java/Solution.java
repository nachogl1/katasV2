import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public static String permutateLetterForward(String letter) {
        if (letter.equals("z")) return " ";
        int charValue = letter.charAt(0);
        return String.valueOf((char) (charValue + 1));
    }

    public static String permutateLetterBackwards(String letter) {
        if (letter.equals("a")) return " ";
        int charValue = letter.charAt(0);
        return String.valueOf((char) (charValue - 1));
    }

    public static String[] getAllForwardPermutations(String word) {
        return getPermutationsFor(word, new ArrayList<>()).toArray(new String[0]);

    }

    private static List<String> getPermutationsFor(String word, ArrayList<String> resultList) {

        Stack<String> stack = new Stack<>();

        for (String str : word.split("")) {
            stack.push(str);
        }

        return actionFoo(stack, resultList);

//        return List.of("begb", "beeb", "bcgb", "bceb");

    }

    private static List<String> actionFoo(Stack<String> stack, ArrayList<String> resultList) {


    }

}
