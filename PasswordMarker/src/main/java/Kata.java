import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata {
    public static String makePassword(String input) {
        input = Arrays.stream(input.split(" "))
                .map(word -> word.split("")[0])
                .collect(Collectors.joining(""));

        return input.replaceAll("(?i)i", "1")
                .replaceAll("(?i)o", "0")
                .replaceAll("(?i)s", "5");
    }
}
