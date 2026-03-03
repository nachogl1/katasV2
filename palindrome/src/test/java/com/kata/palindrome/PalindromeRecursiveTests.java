package com.kata.palindrome;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeRecursiveTests {

    @ParameterizedTest
    @CsvSource({
        "haah, true",
        "racecar, true",
        "a, true",
        "level, true",
        "deed, true",
        "kayak, true",
        "mom, true",
        "noon, true",
        "hello, false",
        "world, false",
        "java, false",
        "test, false",
        "programming, false",
        "A man a plan a canal Panama, true",
        "Was it a car or a cat I saw, true",
        "race car, true",
        "hello world, false",
        "12321, true",
        "12345, false"
    })
    public void testIsPalindrome(String input, boolean expected) {
        assertEquals(expected, PalindromeRecursive.isPalindrome(input),
                     "'" + input + "' palindrome check failed");
    }

}


