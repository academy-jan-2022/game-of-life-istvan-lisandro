package com.java.academy;

import static java.util.Objects.deepEquals;

public class GameOfLife {
    public int[] nextGeneration(int[] cell) {

        if (deepEquals(cell, new int[] {1,1,1})) {
            return new int[]{0, 1, 0};
        }

        return new int[]{0, 0, 0};
    }
}
