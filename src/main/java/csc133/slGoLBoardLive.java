package csc133;

public class slGoLBoardLive extends slGoLBoard {
    public slGoLBoardLive(int numRows, int numCols) {
        super(numRows, numCols);
    }

    public slGoLBoardLive(int numRows, int numCols, int numAlive) {
        super(numRows, numCols, numAlive);
    }

    @Override
    int countLiveTwoDegreeNeighbors(int row, int col) {
        return -1;
    }
    @Override
    int updateNextCellArray() {
        return -1;
    }
}
