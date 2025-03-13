package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTests {

    @Test
    public void solveTheBloodyMaze() {

        char[][] maze = {
                {' ', '#', ' ', ' '},
                {' ', '#', ' ', '#'},
                {' ', ' ', ' ', '#'},
                {'#', ' ', '#', ' '}
        };

        int startX = 0, startY = 0;
        int endX = 2, endY = 2;

        assertTrue(Solution.isPathExist(maze, startX, startY, endX, endY));
    }

    @Test
    public void solveTheBloodyMaze2() {

        char[][] maze = {
                {' ', '#', ' ', ' '},
                {' ', '#', ' ', '#'},
                {' ', '#', ' ', '#'},
                {'#', ' ', '#', ' '}
        };

        int startX = 0, startY = 0;
        int endX = 2, endY = 2;

        assertFalse(Solution.isPathExist(maze, startX, startY, endX, endY));
    }

    @Test
    public void solveTheBloodyMaze3() {

        char[][] maze = {
                {' ', '#', ' ', ' ',' ', ' ', ' '},
                {' ', '#', ' ', '#','#', '#', ' '},
                {' ', '#', ' ', '#','#', ' ', ' '},
                {' ', '#', ' ', '#','#', ' ', '#'},
                {' ', '#', ' ', '#','#', ' ', ' '},
                {' ', ' ', ' ', '#','#', '#', ' '},
                {'#', ' ', '#', ' ','#', ' ', ' '}
        };

        int startX = 0, startY = 0;
        int endX = 6, endY = 6;

        assertTrue(Solution.isPathExist(maze, startX, startY, endX, endY));
    }
}
