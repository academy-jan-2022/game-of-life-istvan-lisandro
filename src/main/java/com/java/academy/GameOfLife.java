package com.java.academy;

public class GameOfLife {
    private final World world;

    public GameOfLife(World world) {
        this.world = world;
    }

    public World start() {
        var result = new int[world.getRows()][world.getColumns()];

        for (int i = 0; i < world.getRows(); i++) {
            for(int j = 0; j < world.getColumns(); j++){
                updateWorld(result, i, j);
            }
        }

        return new World(result);
    }

    private void updateWorld(int[][] result, int i, int j) {
        if(j == 0 || j == world.getColumns() -1){
            return;
        }

        if (world.isCellAlive(i, j) &&
            world.isCellAlive(i, j -1) &&
            world.isCellAlive(i, j +1)
        ) {
            killCell(result[i], j -1);
            bringCellToLife(result[i], j);
            killCell(result[i], j +1);

        } else {
            killCell(result[i], j);
        }
    }

    private void killCell(int[] row, int position) {
        row[position] = 0;
    }

    private void bringCellToLife(int[] row, int position) {
        row[position] = 1;
    }
}
