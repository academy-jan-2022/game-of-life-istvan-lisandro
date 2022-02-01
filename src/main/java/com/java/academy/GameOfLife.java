package com.java.academy;

public class GameOfLife {
    private final World world;

    public GameOfLife(World world) {
        this.world = world;
    }

    public int[][] start() {
        var result = new int[world.getRows()][world.getColumns()];

        for (int i = 0; i < world.getRows(); i++) {
            for(int j = 0; j < world.getColumns(); j++){
                if(j == 0 || j == world.getColumns() -1){
                    continue;
                }

                if (world.isCellAlive(i, j) &&
                    world.isCellAlive(i, j-1) &&
                    world.isCellAlive(i, j+1)
                ) {
                    killCell(result[i], j-1);
                    result[i][j] = 1;
                    killCell(result[i], j+1);

                } else {
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
