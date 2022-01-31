package com.java.academy;

public class GameOfLife {
    public int[] nextGeneration(int[] cell) {
        int[] result = {0};

        if(cell.length > 1){
            return new int[]{0, 0, 0};
        }
        return result;
    }
}
