package com.java.academy;

public class GameOfLife {
    private final World world;

    public GameOfLife(World world) {
        this.world = world;
    }

    public World evolve() {
        var result = new int[world.getRows()][world.getColumns()];

        for (int xAxis = 0; xAxis < world.getRows(); xAxis++) {
            for(int yAxis = 0; yAxis < world.getColumns(); yAxis++){
                result[xAxis][yAxis] = updateCell(new Cell(xAxis, yAxis));
            }
        }

        return new World(result);
    }

    private int updateCell(Cell cell) {
        if(shouldLiveOn(cell) || shouldComeToLife(cell)){
            return 1;
        }

        return 0;
    }

    private boolean shouldComeToLife(Cell cell) {

        return !world.isCellAlive(cell.xAxis(), cell.yAxis()) &&
            world.getAliveNeighbours(cell.xAxis(), cell.yAxis()) == 3;
    }

    private boolean shouldLiveOn(Cell cell) {

        return world.isCellAlive(cell.xAxis(), cell.yAxis()) &&
            (world.getAliveNeighbours(cell.xAxis(), cell.yAxis()) == 2 ||
                world.getAliveNeighbours(cell.xAxis(), cell.yAxis()) == 3);
    }

}
