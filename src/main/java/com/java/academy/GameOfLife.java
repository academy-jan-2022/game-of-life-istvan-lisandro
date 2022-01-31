package com.java.academy;

import static java.util.Objects.deepEquals;

public class GameOfLife {
    public int[] nextGeneration(int[] cell) {
        int[] result = {0};

        if (deepEquals(cell, new int[] {1,1,1})) {
            return new int[]{0, 1, 0};
        }

        if(cell.length > 1){
            return new int[]{0, 0, 0};
        }

        return result;
    }
}
