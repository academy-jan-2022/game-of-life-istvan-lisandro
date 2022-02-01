package com.java.academy;

import java.util.Arrays;

public class GameOfLife {
    public int[] nextGeneration(int[] cell) {
        int[] result = Arrays.copyOf(cell, cell.length);

        for(int i = 0; i<cell.length; i++){
            if(i == 0){
                result[i] = 0;
                continue;
            }

            if(i == (cell.length -1)){
                result[i] = 0;
                continue;
            }

            if(!isCellAlive(cell[i-1]) || !isCellAlive(cell[i+1])){
                result[i] = 0;
            };

            if(isCellAlive(cell[i-1]) && isCellAlive(cell[i+1])) {
                result[i] = cell[i] == 1 ? 1 : 0;
            }
        }

        return result;
    }

    private boolean isCellAlive(int cell) {
        return cell == 1;
    }
}
