package com.kata.twoSum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.of;

class TwoSumSolutionV2Tests {

    @ParameterizedTest
    @MethodSource("allTwoSumTestData")
    void returnUnorderedArray(int[] inputNumbers, int target, int[] expected) {
        Arrays.sort(expected);

        int[] result = TwoSumSolutionV2.twoSum(inputNumbers, target);
        Arrays.sort(result);

        Assertions.assertArrayEquals(expected, result);
    }

    private static Stream<Arguments> allTwoSumTestData() {
        return Stream.of(
                of(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
                of(new int[]{3, 2, 4}, 6, new int[]{1, 2}),
                of(new int[]{3, 3}, 6, new int[]{0, 1}),
                of(new int[]{1, 2, 3, 4, 5}, 9, new int[]{3, 4}),
                of(new int[]{3, 2, 4, 2}, 6, new int[]{1, 2}),
                of(new int[]{-1, -2, -3, -4, -5}, -8, new int[]{2, 4}),
                of(new int[]{0, 4, 3, 0}, 0, new int[]{0, 3}),
                of(new int[]{1, 3, 2, 4, 3}, 7, new int[]{1, 3}),
                of(new int[]{Integer.MAX_VALUE, 1, 2, Integer.MAX_VALUE - 1}, Integer.MAX_VALUE, new int[]{1, 3}),
                of(new int[]{1, 1, 1, 1}, 2, new int[]{0, 1}),
                of(new int[]{100, 200, 300, 400, 500, 600, 700, 800, 900, 1000}, 1500, new int[]{4, 9})
        );
    }
}