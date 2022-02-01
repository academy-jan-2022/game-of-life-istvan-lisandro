package com.java.academy;

public class GameOfLife {
    private World world;

    public GameOfLife(World world) {
        this.world = world;
    }

    public int[][] start() {
        var result = new int[world.getRows()][world.getColumns()];

        for (int i = 0; i < world.getRows(); i++) {
            for(int j = 0; j < world.getColumns(); j++){
                if (world.isCellAlive(i, j)) {
                    killCell(result[i], j);
                }
            }
        }

        return result;
    }

    private void killCell(int[] row, int position) {
        row[position] = 0;
    }
}
