import java.util.AbstractMap.SimpleEntry;

public class FractionReducer {
    public static SimpleEntry<Integer, Integer> reduce(SimpleEntry<Integer, Integer> fractionEntry) {
        int numerator = fractionEntry.getKey();
        int denominator = fractionEntry.getValue();

        int gcd = GCDCalculator.gcd(numerator,denominator);

        return new SimpleEntry<>(numerator / gcd, denominator / gcd);
    }
}
