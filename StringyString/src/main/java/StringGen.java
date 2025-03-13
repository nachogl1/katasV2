import java.util.stream.IntStream;

public class StringGen {
    public String generate(final int length) {

        StringBuilder result = new StringBuilder("1");

        IntStream.range(1, length).forEach(element -> {
            if (result.substring(result.length() - 1).equals("0")) {
                result.append("1");
                return;
            }

            result.append("0");
        });


        return result.toString();
    }
}
