package com.kata.islands;


public class IslandSolution {


    public static int numberOfIslands(String[][] input) {
        int result = 0;
        boolean[][] visited = new boolean[input.length][input[0].length];


        for (int startX = 0; startX <= input.length-1; startX++) {
            for (int startY = 0; startY <= input[0].length-1; startY++) {
                if (input[startX][startY].equals("1") && !visited[startX][startY]) {
                    result++;
                    scanIsland(input, startX, startY, visited);
                }
            }
        }

        return result;
    }

    private static void scanIsland(String[][] input, int x, int y, boolean[][] visited) {
        if (x < 0 || x >= input.length  || y < 0 || y >= input[0].length) {
            return;
        }

        if (visited[x][y]) {
            return;
        }

        if (input[x][y].equals("0")) {
            return;
        }

        visited[x][y] = true;

        scanIsland(input, x - 1, y, visited);
        scanIsland(input, x + 1, y, visited);
        scanIsland(input, x, y - 1, visited);
        scanIsland(input, x, y + 1, visited);

    }
}
