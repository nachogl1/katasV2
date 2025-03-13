import java.util.HashMap;
import java.util.Map;

public class LoseChangeCalculator {
    public Map<String, Integer> calculate(int input) {
        Map<String, Integer> result = getEmptyMap();

        for (Coins coin : Coins.values()) {
            while (input - coin.getValue() >= 0) {
                input -= coin.getValue();
                result.put(coin.toString(), result.get(coin.toString())+1);
            }
        }

        return result;
    }

    private Map<String, Integer> getEmptyMap() {
        return new HashMap<String, Integer>() {{
            put(Coins.PENNIES.toString(), 0);
            put(Coins.NICKELS.toString(), 0);
            put(Coins.DIMES.toString(), 0);
            put(Coins.QUARTERS.toString(), 0);
        }};
    }

    enum Coins {
        QUARTERS(25),
        DIMES(10),
        NICKELS(5),
        PENNIES(1);


        private final int value;

        Coins(int input) {
            this.value = input;
        }

        public int getValue() {
            return value;
        }
    }

}
