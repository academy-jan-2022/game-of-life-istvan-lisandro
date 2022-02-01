package com.java.academy;

import java.util.Arrays;

public class GameOfLife {
    public int[][] start(int[][] world) {
        var result = Arrays.copyOf(world, world.length);

        for (int i = 0; i < world[0].length; i++) {
            if (isItAlive(world[0], i)) {
                killCell(result[0], i);
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
