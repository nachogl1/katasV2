package com.nachogl1.maze.Maze;

public class MazeSolver {

    public static boolean isPathExist(char[][] maze, int startX, int startY, int endX, int endY) {
        return canReach(maze, startX, startY, endX, endY, new boolean[maze.length][maze[0].length]);
    }

    private static boolean canReach(char[][] maze, int x, int y, int endX, int endY, boolean[][] visited) {
        // Base case: If we are out of bounds, hit a wall, or already visited, return false
        if (x < 0 || x >= maze.length || y < 0 || y >= maze[0].length || maze[x][y] == '#' || visited[x][y]) {
            return false;
        }

        // Base case: If we reached the target, return true
        if (x == endX && y == endY) {
            return true;
        }

        // Mark the current cell as visited
        visited[x][y] = true;

        // Recursive calls for all four directions
        boolean up = canReach(maze, x - 1, y, endX, endY, visited);
        boolean down = canReach(maze, x + 1, y, endX, endY, visited);
        boolean left = canReach(maze, x, y - 1, endX, endY, visited);
        boolean right = canReach(maze, x, y + 1, endX, endY, visited);

        // Return true if any path leads to the target
        return up || down || left || right;
    }
}
