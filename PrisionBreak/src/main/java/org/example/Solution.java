package org.example;

import java.util.Arrays;

public class Solution {
    public static int solve(int[] prisonerRow) {
        if (prisonerRow[0] == 1) {
            return 0;
        }
        return recursiveFreedom(prisonerRow, 0, 0);
    }

    private static int recursiveFreedom(int[] prisonerRow, int index, int free) {

        if (index > prisonerRow.length - 1) {
            return free;
        }

        if (prisonerRow[index] == 0) {
            free++;
            prisonerRow = update(prisonerRow);
        }

        return recursiveFreedom(prisonerRow, ++index, free);

    }

    private static int[] update(int[] prisonerRow) {
        return Arrays.stream(prisonerRow).map(cell -> cell == 1 ? 0 : 1).toArray();
    }
}
