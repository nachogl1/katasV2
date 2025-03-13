public class Kata {

    public static final int OFFSET = 65;

    public static String parse(String str) {

        StringBuilder result = new StringBuilder(" ".repeat(25));

        for (char letter : str.toCharArray()) {
            final int index = (int) letter - OFFSET;
            result.setCharAt(index, letter);
        }

        return result.toString().stripTrailing();
    }
}
