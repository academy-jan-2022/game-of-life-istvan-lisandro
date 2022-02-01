package com.java.academy;

import java.util.Arrays;

public class GameOfLife {
    public int[][] start(int[][] world) {
        var result = Arrays.copyOf(world, world.length);

        if (world[0][0] == 1) {
            result[0][0] = 0;
        }

        return result;
    }
}
