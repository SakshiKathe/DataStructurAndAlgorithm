package BackTracking;

public class SudokuSolver {
    public static boolean solve(int sudoku[][], int row, int col) {
        // base case

        // recursion
        int nextRow = row, nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                solve(sudoku, nextRow, nextCol);
            }
        }
        return true;

    }

    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        return false;
    }

    public static void main(String[] args) {
        int sudoku[][] = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };

        solve(sudoku, 0, 0);
    }
}
