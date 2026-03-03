package com.kata.twoSum;


public class TwoSumSolutionV2 {

    public static int[] twoSum(int[] inputNumber, int target) {
        return recursiveOuter(inputNumber, target, 0);
    }

    private static int[] recursiveOuter(int[] inputNumber, int target, int x) {
        if (x > inputNumber.length - 1) { //Not relevant if > or >= due to the premise of the problem. By the time we reach the last index, we knew already the pair or it is null.
            return null;
        }

        int[] result = new int[2];
        result[0] = x;

        Integer potentialResult = recursiveInner(inputNumber, x, 0, target);

        if (potentialResult != null) {
            result[1] = potentialResult;
            return result;
        }

        return recursiveOuter(inputNumber, target, ++x);

    }

    private static Integer recursiveInner(int[] inputNumber, int indexUnderTest, int indexNextNumber, int target) {
        if (indexNextNumber > inputNumber.length - 1) {
            return null;
        }

        if (indexUnderTest == indexNextNumber) {
            //The code may work without this, but this assures the first pair is found in case there are more pairs that amount to target
            recursiveInner(inputNumber, indexUnderTest, ++indexNextNumber, target);
        }

        if (inputNumber[indexUnderTest] + inputNumber[indexNextNumber] == target) {
            return indexNextNumber;
        }

        return recursiveInner(inputNumber, indexUnderTest, ++indexNextNumber, target);

    }
}
