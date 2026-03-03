package com.kata.twoSum;


public class TwoSumSolutionV1 {

    public static int[] twoSum(int[] inputNumber, int target) {
        for (int x = 0; x <= inputNumber.length - 1; x++) {
                int[] result = new int[2];
                result[0] = x;
                Integer potentialResult = recursiveCall(inputNumber, x, 0, target);
                if (potentialResult != null) {
                    result[1] = potentialResult;
                    return result;
                }

        }

        return null;
    }



    private static Integer recursiveCall(int[] inputNumber, int indexUnderTest, int indexNextNumber, int target) {
        if (indexNextNumber > inputNumber.length - 1) {
            return null;
        }

        if (indexUnderTest == indexNextNumber) {
            //The code may work without this, but this assures the first pair is found in case there are more pairs that amount to target
            recursiveCall(inputNumber, indexUnderTest, ++indexNextNumber, target);
        }

        if (inputNumber[indexUnderTest] + inputNumber[indexNextNumber] == target) {
            return indexNextNumber;
        }

        return recursiveCall(inputNumber, indexUnderTest, ++indexNextNumber, target);

    }
}
