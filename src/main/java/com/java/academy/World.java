package com.java.academy;

public class World {
    private final int[][] world;

    public World(int[][] grid) {
        this.world = grid;
    }

    public int getRows() {
        return world.length;
    }

    public int getColumns() {
        return world[0].length;
    }

    public boolean isCellAlive(int row, int position) {
        return world[row][position] == 1;
    }

    public int getRightNeighbour(int xAxis, int yAxis) {
        if (hasCellOnTheRight(yAxis)) {
            return world[xAxis][yAxis + 1];
        }
        return 0;
    }

    public int getLeftNeighbour(int xAxis, int yAxis) {
        if (hasCellOnTheLeft(yAxis)) {
            return world[xAxis][yAxis -1];
        }
        return 0;
    }

    private boolean hasCellOnTheRight(int yAxis) {
        return yAxis < getColumns() - 1;
    }

    private boolean hasCellOnTheLeft(int yAxis) {
        return yAxis > 0;
    }

    public int getTopNeighbour(int xAxis, int yAxis) {
        if (hasCellOnTop(xAxis)) {
            return world[xAxis-1][yAxis];
        }
        return 0;
    }

    private boolean hasCellOnTop(int xAxis) {
        return xAxis > 0;
    }

    public int getBottomNeighbour(int xAxis, int yAxis) {
        return 0;
    }
}
