package com.kata.fibonacci;

public class FibonacciSolution {

    public static int getFibonacciNumberForIndex(int input) {
        return recursive(input);
    }

    private static int recursive(int input) {
        if (input <= 1) return input;
        return recursive(input - 1) + recursive(input - 2);
    }
}