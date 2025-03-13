import java.util.Arrays;

public class PolybiusParser {

    final private static String[][] reference = {
            {"A", "B", "C", "D", "E"},
            {"F", "G", "H", "I", "K"},
            {"L", "M", "N", "O", "P"},
            {"Q", "R", "S", "T", "U"},
            {"V", "W", "X", "Y", "Z"}
    };

    public static String polybius(String input) {
        StringBuilder result = new StringBuilder();
        input = transformJsIntoIs(input);

        Arrays.stream(input.split("")).forEach((letter) -> {
            if (letter.equals(" ")) {
                result.append(" ");
            } else {
                for (int i = 0; i < reference.length; i++) {
                    for (int j = 0; j < reference[i].length; j++) {
                        if (reference[i][j].equals(letter)) {
                            int input1 = i + 1;
                            int input2 = j + 1;
                            result.append(input1 + "" + input2);
                        }

                    }
                }
            }

        });

        return result.toString();
    }

    private static String transformJsIntoIs(String input) {
        input = input.replaceAll("J", "I");
        return input;
    }
}
