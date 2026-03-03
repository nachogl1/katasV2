package com.kata.fibonacci;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DynamicFibonacciApplicationTests {

    @ParameterizedTest
    @CsvSource({"50,12586269025", "60, 1548008755920", "70, 190392490709135"})
    void findHeavyFibonacciNumbers(int input, long expected) {
        Assertions.assertEquals(expected, DynamicFibonacciSolution.getFibonacciNumberForIndex(input));
    }

}
