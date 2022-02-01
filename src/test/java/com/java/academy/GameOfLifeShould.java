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

}
