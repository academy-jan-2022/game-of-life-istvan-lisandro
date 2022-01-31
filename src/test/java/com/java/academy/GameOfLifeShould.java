package com.java.academy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameOfLifeShould {

    @Test void
    return_a_dead_center_cell_when_two_dead_neighbours(){
        var gameOfLife = new GameOfLife();
        int[] deadCells = {0, 0, 0};

        var result = gameOfLife.nextGeneration(deadCells);

        assertEquals(0, result[1]);
    }

    @Test void
    a_alive_center_cell_when_when_two_alive_neighbours(){
        var gameOfLife = new GameOfLife();
        int[] deadCells = {1, 1, 1};

        var result = gameOfLife.nextGeneration(deadCells);

        assertEquals(1, result[1]);
    }

    @Test void
    return_two_live_and_two_dead_when_entering_four_live_in_a_row() {
        var gameOfLife = new GameOfLife();
        int[] input = {1, 1, 1, 1};

        var result = gameOfLife.nextGeneration(input);

        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
        assertEquals(1, result[2]);
        assertEquals(0, result[3]);
    }

}
