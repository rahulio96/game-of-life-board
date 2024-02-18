package csc133;

public class slGoLBoardLive extends slGoLBoard {
    public slGoLBoardLive(int numRows, int numCols) {
        super(numRows, numCols);
    }

    public slGoLBoardLive(int numRows, int numCols, int numAlive) {
        super(numRows, numCols, numAlive);
    }

    @Override
    public int countLiveTwoDegreeNeighbors(int row, int col) {
        int count = 0;
        int [][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {1, 1}, {-1, -1}, {1, -1}, {-1, 1}};
        for (int i = 0; i < directions.length; i++) {
            int new_r = row + directions[i][0], new_c = col + directions[i][1];
            // Interior cells
            if (new_r >= 0 && new_r < NUM_ROWS && new_c >= 0 && new_c < NUM_COLS) {
                count++;
            }
        }
        return count;
    }
    @Override
    int updateNextCellArray() {
        return -1;
    }
}
