package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTests {

    @ParameterizedTest
    @MethodSource("provideInmates")
    void freeOnePrisoner(int[] input, int expected) {
        assertEquals(expected, Solution.solve(input));
    }

    private static Stream<Arguments> provideInmates() {
        return Stream.of(
                Arguments.of(new int[]{0, 0}, 1),
                Arguments.of(new int[]{0, 0, 0}, 1),
                Arguments.of(new int[]{1, 1, 1}, 0),
                Arguments.of(new int[]{1,0,0,0}, 0),
                Arguments.of(new int[]{0, 0, 1, 1, 1, 0, 1}, 4)
        );
    }


}
