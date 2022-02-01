package com.java.academy;

import java.util.Arrays;

public class GameOfLife {
    public int[][] start(int[][] world) {
        var result = Arrays.copyOf(world, world.length);


        for (int i = 0; i < world.length; i++) {
            for(int j = 0; j < world[i].length; j++){
                if (isItAlive(world[i], j)) {
                    killCell(result[i], j);
                }
            }
        }

        return result;
    }

    private boolean isItAlive(int[] row, int position) {
        return row[position] == 1;
    }

    private void killCell(int[] row, int position) {
        row[position] = 0;
    }
}
