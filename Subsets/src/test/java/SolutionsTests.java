import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionsTests {

    @Test
    void returnSubsets1() {
        assertEquals(1, Solution.solve(List.of(1)));
    }

    @Test
    void returnSubsets2() {
        assertEquals(3, Solution.solve(List.of(1,2)));
    }

    @Test
    void returnSubsets3() {
        assertEquals(7, Solution.solve(List.of(1,2,3)));
    }

    @Test
    void returnSubsets4() {
        assertEquals(15, Solution.solve(List.of(1,2,3,4)));
    }

}
