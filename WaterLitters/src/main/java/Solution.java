public class Solution {
    public static int solve(float inputTime) {
        //Java simply discards the fractional part when casting to int, so it works for our round down mode
        return (int) (inputTime*0.5);
    }
}
