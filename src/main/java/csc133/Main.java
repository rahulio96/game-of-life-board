package csc133;

public class Main {
    private static final int ROWS = 7, COLS = 9;
    private static slGoLBoardLive my_board;
    public static void main(String[] args) {
        test_1();
        test_2();
        test_3();
        test_4();
        test_5();
    }

    private static void printCountTwoDegreeNeighbors(int x, int y) {
        my_board = new slGoLBoardLive(ROWS, COLS);
        my_board.printGoLBoard();
        System.out.println("TwoDegreeNeighbors(" + x +", " + y + ") --> " +
                my_board.countLiveTwoDegreeNeighbors(x, y));
        System.out.println();
    }

    // print TwoDegreeNeighbors(0,0)
    private static void test_1() {
        printCountTwoDegreeNeighbors(0, 0);
    }

    // print TwoDegreeNeighbors(ROWS-1, COLS-1)
    private static void test_2() {
        printCountTwoDegreeNeighbors(ROWS-1, COLS-1);
    }

    // print TwoDegreeNeighbors((int)(ROWS/2), (int)(ROWS/2))
    private static void test_3() {
        printCountTwoDegreeNeighbors((int)(ROWS/2), (int)(ROWS/2));
    }

    // print TwoDegreeNeighbors(0, (int)(ROWS/2))
    private static void test_4() {
        printCountTwoDegreeNeighbors(0, (int)(ROWS/2));
    }

    // print the board and the updated board
    private static void test_5() {
        my_board = new slGoLBoardLive(ROWS, COLS);
        my_board.printGoLBoard();
        System.out.println("Board updated:");
        int liveCells = my_board.updateNextCellArray();
        my_board.printGoLBoard();
    }
}
