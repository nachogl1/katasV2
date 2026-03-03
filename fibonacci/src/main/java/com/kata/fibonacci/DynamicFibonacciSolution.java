package com.kata.fibonacci;

import java.util.HashMap;
import java.util.Map;

//Tried using concurrent map but was not possible because of recursive changes in the same index
public class DynamicFibonacciSolution {

    public static long getFibonacciNumberForIndex(int input) {
        Map<Integer, Long> memo = new HashMap<>();
        memo.put(0, 0L);
        memo.put(1, 1L);

        for (int i = 2; i <= input; i++) {
            memo.put(i, memo.get(i - 1) + memo.get(i - 2));
        }

        return memo.get(input);
    }
}