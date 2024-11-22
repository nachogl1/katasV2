package com.nachogl1.maze.Maze;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.nachogl1.maze.Maze.MazeSolver.isPathExist;

public class MazeSolverShould {

    @Test
    @DisplayName("Solve the bloody maze")
    public void solveTheBloodyMaze() {

        char[][] maze = {
                {' ', '#', ' ', ' '},
                {' ', '#', ' ', '#'},
                {' ', ' ', ' ', '#'},
                {'#', ' ', '#', ' '}
        };

        int startX = 0, startY = 0;
        int endX = 2, endY = 2;

        Assertions.assertTrue(isPathExist(maze, startX, startY, endX, endY));
    }
}
