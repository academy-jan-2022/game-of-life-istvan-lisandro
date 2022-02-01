package com.java.academy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldShould {

    @Test void
    return_neighbour_on_the_right(){
        var world = new World(new int[][]{{0}});

        var result = world.getRightNeighbour(0,0);

        assertEquals(0, result);
    }

}