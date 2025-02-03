public class RomanConverter {
    enum RomanNumber {
        M(1000),
        CM(900),
        D(500),
        CD(400),
        C(100),
        XC(90),
        L(50),
        XL(40),
        X(10),
        IX(9),
        V(5),
        IV(4),
        I(1);

        private final int value;

        RomanNumber(final int input) {
            this.value = input;
        }

        public int getValue() {
            return value;
        }
    }

    public String convert(int input) {

        StringBuilder result = new StringBuilder();

        for (RomanNumber number : RomanNumber.values()) {
            while (input >= number.getValue()) {
                result.append(number.name());
                input -= number.getValue();
            }
        }

        return result.toString();
    }

}
