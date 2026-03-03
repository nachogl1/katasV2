package com.kata.islands;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IslandsApplicationTests {

    @Test
    void acceptanceTestOne() {
        String[][] input = new String[][]{
                {"1", "1", "1", "1", "0"},
                {"1", "1", "0", "1", "0"},
                {"1", "1", "0", "0", "0"},
                {"0", "0", "0", "0", "0"}
        };

        Assertions.assertEquals(1, IslandSolution.numberOfIslands(input));

    }

    @Test
    void acceptanceTestTwo() {

        String[][] input = new String[][]{
                {"1", "1", "0", "0", "0"},
                {"1", "1", "0", "0", "0"},
                {"0", "0", "0", "0", "0"},
                {"0", "0", "0", "1", "1"}
        };

        Assertions.assertEquals(2, IslandSolution.numberOfIslands(input));

    }

    @Test
    void acceptanceTestThree() {

        String[][] input = new String[][]{
                {"1", "1", "0", "0", "0"},
                {"1", "1", "0", "0", "0"},
                {"0", "0", "1", "0", "0"},
                {"0", "0", "0", "1", "1"}
        };

        Assertions.assertEquals(3, IslandSolution.numberOfIslands(input));

    }
}
