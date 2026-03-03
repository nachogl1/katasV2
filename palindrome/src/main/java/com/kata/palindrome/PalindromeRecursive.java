package com.kata.palindrome;

public class PalindromeRecursive {

    public static boolean isPalindrome(String input) {
        if (input == null || input.length() < 2) {
            return true;
        }
        String clearedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return recursiveCall(clearedInput, 0, clearedInput.length() - 1);
    }

    private static boolean recursiveCall(final String input, final int startIndex, final int endIndex) {
        if (startIndex < endIndex) {
            if (input.charAt(startIndex) != input.charAt(endIndex)) {
                return false;
            }
            return recursiveCall (input, startIndex + 1, endIndex - 1);
        }

        return true;

    }


}
