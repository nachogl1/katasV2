package com.nachogl1.maze.Maze;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MazeSolverTest {

    private MazeSolver mazeSolver;

    @BeforeEach
    void setup() {
        this.mazeSolver = createMazeSolver();
    }

    protected MazeSolver createMazeSolver() {
        return new MazeSolverImpl();
    }

    @Test
    void solve2x2() {
        Maze maze = MazeTestingUtils.parse(
                "  ",
                "  "
        );

        assertTrue(mazeSolver.canMoveBetweenPointsOnMaze(maze, 0, 0, 0, 0));
    }

    @Test
    void solve2x2Down() {
        Maze maze = MazeTestingUtils.parse(
                "  ",
                "  "
        );

        assertTrue(mazeSolver.canMoveBetweenPointsOnMaze(maze, 0, 0, 0, 1));
    }

    @Test
    void solve2x2withOneMove() {
        Maze maze = MazeTestingUtils.parse(
                "  ",
                "  "
        );

        assertTrue(mazeSolver.canMoveBetweenPointsOnMaze(maze, 0, 0, 1, 0));
    }

    @Test
    void solve2x2with2Moves() {
        Maze maze = MazeTestingUtils.parse(
                "   ",
                "   "
        );

        assertTrue(mazeSolver.canMoveBetweenPointsOnMaze(maze, 0, 0, 2, 0));
    }

    @Test
    void solve2x2with2MovesFalse() {
        Maze maze = MazeTestingUtils.parse(
                " # ",
                " # "
        );

        assertFalse(mazeSolver.canMoveBetweenPointsOnMaze(maze, 0, 0, 2, 0));
    }

}
