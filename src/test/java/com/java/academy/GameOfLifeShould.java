package com.java.academy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class GameOfLifeShould {

    @Test void
    should_return_one_dead_ceLl_when_entering_one_dead_cell(){
        var game = new GameOfLife();
        var result = game.start(new int[][]{{0}});

        assertArrayEquals(new int[][]{{0}}, result);
    }

    @Test void
    should_return_two_dead_cells_when_entering_two_dead_cells(){
        var game = new GameOfLife();
        var result = game.start(new int[][]{{0,0}});

        assertArrayEquals(new int[][]{{0, 0}}, result);
    }

    @Test void
    should_return_three_dead_cells_when_entering_three_dead_cells(){
        var game = new GameOfLife();
        var result = game.start(new int[][]{{0,0,0}});

        assertArrayEquals(new int[][]{{0, 0, 0}}, result);
    }

    @Test void
    should_return_three_dead_cells_when_entering_two_dead_cells_and_one_alive(){
        var game = new GameOfLife();
        var result = game.start(new int[][]{{1,0,0}});

        assertArrayEquals(new int[][]{{0, 0, 0}}, result);
    }

    @Test void
    should_return_three_dead_cells_when_entering_one_dead_cell1_and_two_alive(){
        var game = new GameOfLife();
        var result = game.start(new int[][]{{1,1,0}});

        assertArrayEquals(new int[][]{{0, 0, 0}}, result);
    }


}
