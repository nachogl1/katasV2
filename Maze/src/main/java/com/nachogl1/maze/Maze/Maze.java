package com.nachogl1.maze.Maze;

@SuppressWarnings("unused")
public class Maze {

    private final boolean[][] vacantCells;
    private final int width;
    private final int height;

    Maze(boolean[][] vacantCells, int width, int height) {
        this.vacantCells = vacantCells;
        this.width = width;
        this.height = height;
    }

    /**
     * Returns true if the cell in the maze at x,y is empty
     */
    public boolean canMoveInto(int x, int y) {
        return x >= 0 && x < width && y >= 0 && y < height && vacantCells[x][y];
    }

    /**
     * Returns how wide the maze is, i.e. how many cells there are on the x-axis
     */
    public int getWidth() {
        return width;
    }

    /**
     * Returns how high the maze is, i.e. how many cells there are on the y-axis
     */
    public int getHeight() {
        return height;
    }
}
