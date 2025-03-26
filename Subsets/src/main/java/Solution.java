import java.util.HashSet;
import java.util.List;

public class Solution {
    public static int solve(List<Integer> initialSet) {
        //After a lot of thinking, went to check the solution
        // There is a catch, for a n numbers set of distinct numbers, the number of distinct subsets is (n^2)-1
        return (1 << new HashSet<>(initialSet).size()) - 1; //(1 x 2^size)-1 and we use 1L to treat as long, so it does not overflow when use ints
    }


}