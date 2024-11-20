package com.nachogl1.maze.Maze;

public class MazeSolverImpl implements MazeSolver {

    @Override
    public boolean canMoveBetweenPointsOnMaze(Maze maze, int startX, int startY, int endX, int endY) {
        return transverse(maze, startX, startY, endX, endY);
    }

    private boolean transverse(Maze maze, int currentX, int currentY, int endX, int endY) {
        if (isSamePoint(currentX, currentY, endX, endY)) {
            return true;
        }

        if (!maze.canMoveInto(currentX, currentY)) {
            return false;
        }

        if (transverse(maze, currentX + 1, currentY, endX, endY)) {
            return true;
        }
        if (transverse(maze, currentX, currentY + 1, endX, endY)) {
            return true;
        }
        if (transverse(maze, currentX - 1, currentY, endX, endY)) {
            return true;
        }
        if (transverse(maze, currentX, currentY - 1, endX, endY)) {
            return true;
        }

        return false;

    }

    private static boolean isSamePoint(int startX, int startY, int endX, int endY) {
        return startX == endX && startY == endY;
    }


}
