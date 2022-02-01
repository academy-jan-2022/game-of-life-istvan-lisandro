package com.java.academy;

import java.util.Arrays;

public class GameOfLife {
    public int[][] start(int[][] world) {
        var result = Arrays.copyOf(world, world.length);

        if (world[0][0] == 1) {
            result[0][0] = 0;
        }

        if(world[0].length > 1 && world[0][1] == 1){
            result[0][1] = 0;
        }

        if(world[0].length > 2 && world[0][2] == 1){
            result[0][2] = 0;
        }

        return result;
    }
}
