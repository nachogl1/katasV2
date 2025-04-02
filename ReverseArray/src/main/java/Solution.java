public class Solution {
    public static char[] reverse(char[] input) {
        //Do not use anything that makes your life easier

        char[] result = new char[input.length];

        for (int i = input.length - 1; i >= 0; i--) {
            result[result.length - 1 - i] = input[i];
        }

        return result;
    }
}
