*Problem Statement:*

You are given a 2D matrix representing a maze. Each cell in the matrix is either a *free space (' ')* or a *wall ('#')*. Your task is to determine if there is a path from a given starting point (startX, startY) to a target point (endX, endY).

*Movement Rules:*
- You can only move *up, down, left, or right* (no diagonal movement).
- You cannot move through walls ('#'), and you cannot revisit a cell that you've already visited.

*Input:*
1. A 2D char array maze where ' ' represents free spaces and '#' represents walls.
2. Integers startX and startY representing the starting cell coordinates.
3. Integers endX and endY representing the target cell coordinates.

*Output:*
The function should return a boolean:
- true if there exists a valid path from the starting point to the target point.
- false if no such path exists.

*Example:*
Given the maze:

{
    {' ', '#', ' ', ' '},
    {' ', '#', ' ', '#'},
    {' ', ' ', ' ', '#'},
    {'#', ' ', '#', ' '}
}

- Starting point: (0, 0)
- Target point: (2, 2)

The function should return true, as there is a valid path.