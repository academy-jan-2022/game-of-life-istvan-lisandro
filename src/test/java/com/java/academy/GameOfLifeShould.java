package com.java.academy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class GameOfLifeShould {

    @Test void
    return_one_dead_ceLl_when_entering_one_dead_cell(){
        var world = new World (new int [][]{{0}});
        var game = new GameOfLife(world);
        int[][] expected = {{0}};

        var result = game.start();

        assertArrayEquals(expected, result);
    }

    @Test void
    return_two_dead_cells_when_entering_two_dead_cells(){
        var world = new World (new int [][]{{0,0}});
        var game = new GameOfLife(world);
        int[][] expected = {{0, 0}};

        var result = game.start();

        assertArrayEquals(expected, result);
    }

    @Test void
    return_three_dead_cells_when_entering_three_dead_cells(){
        var world = new World (new int [][]{{0,0,0}});
        var game = new GameOfLife(world);
        int[][] expected = {{0, 0, 0}};

        var result = game.start();

        assertArrayEquals(expected, result);
    }

    @Test void
    return_three_dead_cells_when_entering_two_dead_cells_and_one_alive(){
        var world = new World (new int [][]{{1,0,0}});
        var game = new GameOfLife(world);
        int[][] expected = {{0, 0, 0}};

        var result = game.start();

        assertArrayEquals(expected, result);
    }

    @Test void
    return_four_dead_cells_when_entering_two_dead_cells_and_two_alive(){
        var world = new World (new int [][]{{0,1,1,0}});
        var game = new GameOfLife(world);
        int[][] expected = {{0, 0, 0, 0}};

        var result = game.start();

        assertArrayEquals(expected, result);
    }

    @Test void
    return_all_dead_cells_when_entering_non_evolving_positioned_live_cells(){
        var world = new World(new int[][]{
            {1,0,1,0},
            {0,0,0,1}
        });

        var game = new GameOfLife(world);
        var expected = new int[][] {
            {0,0,0,0},
            {0,0,0,0}
        };

        var result = game.start();

        assertArrayEquals(expected, result);
    }

    @Test void
    return_one_alive_cell_and_two_dead_cells_when_entering_three_alive_cells_horizontally(){
        var world = new World (new int [][]{{1,1,1}});
        var game = new GameOfLife(world);
        int[][] expected = {{0, 1, 0}};

        var result = game.start();

        assertArrayEquals(expected, result);
    }


}
