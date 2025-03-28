public class GCDCalculator {
    public static int gcd(int x, int y) {
        return (y == 0) ? x : gcd(y, x % y);
    }
}
