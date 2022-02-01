package com.java.academy;

public class World {
    private final int[][] world;

    public World(int[][] grid) {
        this.world = new int[grid.length][grid[0].length];
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

}
