package com.kata.fibonacci;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FibonacciApplicationTests {

    @ParameterizedTest
    @CsvSource({"0,0", "1,1", "18,2584", "5,5", "22,17711", "15,610"})
    void findFibonacciNumber(int input, int expected) {
        Assertions.assertEquals(expected, FibonacciSolution.getFibonacciNumberForIndex(input));
    }


}
