package com.java.academy;

import java.util.Arrays;

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

}
