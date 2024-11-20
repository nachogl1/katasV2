package com.nachogl1.maze.Maze;

public interface MazeSolver {

    /**
     * @param maze   The {@link Maze} in which we are searching for a path.
     * @param startX The row of the start position.
     * @param startY The column of the start position.
     * @param endX   The row of the end position.
     * @param endY   The column of the end position.
     * @return True if there is a valid path between the start and the end positions in the given maze, or false otherwise.
     */
    boolean canMoveBetweenPointsOnMaze(Maze maze, int startX, int startY, int endX, int endY);
}
