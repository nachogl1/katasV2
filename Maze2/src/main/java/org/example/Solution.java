package org.example;

public class Solution {
    public static boolean isPathExist(char[][] maze, int startX, int startY, int endX, int endY) {
        if (endX > maze.length && endY > maze.length) {
            throw new RuntimeException("End point out of bounds of the maze, miau!");
        }

        return canReach(maze, startX, startY, endX, endY, new boolean[maze.length][maze[0].length], "", "START");
    }

    private static boolean canReach(char[][] maze, int x, int y, int endX, int endY, boolean[][] visitedMaze, String commands, String commandOption) {
        commands = commands.concat(", " + commandOption);

        if (pointOutBounds(maze, x, y)) return false;

        if (isWall(maze, x, y)) return false;

        if (isVisited(visitedMaze, x, y)) return false;

        if (isSuccess(x, y, endX, endY)) {
            System.out.println(commands);
            return true;
        }

        visitedMaze[x][y] = true;

        return
                canReach(maze, x + 1, y, endX, endY, visitedMaze, commands,"DOWN") ||
                        canReach(maze, x, y + 1, endX, endY, visitedMaze, commands,"RIGHT") ||
                        canReach(maze, x - 1, y, endX, endY, visitedMaze, commands,"UP") ||
                        canReach(maze, x, y - 1, endX, endY, visitedMaze, commands,"LEFT");

    }

    private static boolean pointOutBounds(char[][] maze, int x, int y) {
        return y >= maze.length || x >= maze[0].length || x < 0 || y < 0;
    }

    private static boolean isSuccess(int x, int y, int endX, int endY) {
        return x == endX && y == endY;
    }

    private static boolean isVisited(boolean[][] visitedMaze, int x, int y) {
        return visitedMaze[x][y];
    }

    private static boolean isWall(char[][] maze, int x, int y) {
        return maze[x][y] == '#';
    }
}
