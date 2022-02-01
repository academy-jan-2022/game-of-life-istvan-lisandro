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
        if (getColumns() > 1 && yAxis < getColumns() -1) {
            return world[xAxis][yAxis + 1];
        }
        return 0;
    }
}
