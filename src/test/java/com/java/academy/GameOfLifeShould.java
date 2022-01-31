package com.java.academy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameOfLifeShould {
    @Test void
    return_a_dead_cell_when_a_dead_cell_is_give(){
        var gameOfLife = new GameOfLife();
        int[] deadCell = {0};

        var result = gameOfLife.nextGeneration(deadCell);

        assertEquals(0, result[0]);
    }

    @Test void
    return_3_dead_cells_when_3_dead_cells_are_given(){
        var gameOfLife = new GameOfLife();
        int[] deadCells = {0, 0, 0};

        var result = gameOfLife.nextGeneration(deadCells);

        assertEquals(0, result[1]);
    }


}
