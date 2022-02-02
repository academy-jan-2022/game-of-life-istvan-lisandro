package com.java.academy;

public class GameOfLife {
    private final World world;

    public GameOfLife(World world) {
        this.world = world;
    }

    public World start() {
        var result = new int[world.getRows()][world.getColumns()];

        for (int xAxis = 0; xAxis < world.getRows(); xAxis++) {
            for(int yAxis = 0; yAxis < world.getColumns(); yAxis++){
                result[xAxis][yAxis] = updateCell(xAxis, yAxis);
            }
        }

        return new World(result);
    }

    private int updateCell(int xAxis, int yAxis) {

        if(shouldLiveOn(xAxis, yAxis) || shouldComeToLife(xAxis, yAxis)){
            return 1;
        }

        return 0;
    }

    private boolean shouldComeToLife(int xAxis, int yAxis) {
        return !world.isCellAlive(xAxis, yAxis) &&
            world.getAliveNeighbours(xAxis, yAxis) == 3;
    }

    private boolean shouldLiveOn(int xAxis, int yAxis) {
        return world.isCellAlive(xAxis, yAxis) &&
            (world.getAliveNeighbours(xAxis, yAxis) == 2 ||
                world.getAliveNeighbours(xAxis, yAxis) == 3);
    }

}
