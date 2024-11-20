package com.nachogl1.maze.Maze;

public class MazeTestingUtils {

    static Maze parse(String... rows) {

        final int height = rows.length;
        final int width = rows[0].length();

        if (height == 1 || width == 1) {
            throw new IllegalArgumentException("Mazes must be two dimensional");
        }
        for (String row : rows) {
            if (row.length() != width) {
                throw new IllegalArgumentException("All rows must have the same number of columns");
            }
        }

        boolean[][] vacantCells = new boolean[width][];
        for (int i = 0; i < width; ++i) {
            vacantCells[i] = new boolean[height];
        }

        for (int y = 0; y < rows.length; ++y) {
            for (int x = 0; x < width; ++x) {
                vacantCells[x][y] = rows[y].charAt(x) == ' ';
            }
        }

        return new Maze(vacantCells, width, height);
    }
}
