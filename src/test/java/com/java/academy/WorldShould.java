package com.java.academy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldShould {

    @Test void
    return_dead_neighbour_on_the_right(){
        var world = new World(new int[][]{{0}});

        var result = world.getRightNeighbour(0,0);

        assertEquals(0, result);
    }

    @Test void
    return_alive_neighbour_on_the_right(){
        var world = new World(new int[][]{{0, 1}});

        var result = world.getRightNeighbour(0,0);

        assertEquals(1, result);
    }

    @Test void
    return_dead_neighbour_on_the_right_if_last_position(){
        var world = new World(new int[][]{{0, 1}});

        var result = world.getRightNeighbour(0,1);

        assertEquals(0, result);
    }

}
