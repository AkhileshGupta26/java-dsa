package RECURSION.Backtracking2;

public class NKnights {
    public static void main(String[] args) {
        int n = 3;
        boolean[][] board = new boolean[n][n];
        knights(board, 0, 0, 4);
    }

    static void knights(boolean[][] board, int row, int col, int knights) {
        if (knights == 0) {
            display(board);
            return;
        }

        // If we reach the end of the row, move to the next row
        if (col == board.length) {
            knights(board, row + 1, 0, knights);
            return;
        }

        // If we exceed the number of rows, return
        if (row == board.length) {
            return;
        }

        // Place a knight if it is safe
        if (isSafe(board, row, col)) {
            board[row][col] = true;
            knights(board, row, col + 1, knights - 1);
            board[row][col] = false; // Backtrack
        }

        // Skip this position and move to the next column
        knights(board, row, col + 1, knights);
    }

    // Display the board
    static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("K ");
                } else {
                    System.out.print("x ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // Check if the position is within the board boundaries
    static boolean isValid(boolean[][] board, int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board.length;
    }

    // Check if it's safe to place a knight at the given position
    public static boolean isSafe(boolean[][] board, int row, int col) {
        if (isValid(board, row - 2, col - 1) && board[row - 2][col - 1]) {
            return false;
        }
        if (isValid(board, row - 1, col - 2) && board[row - 1][col - 2]) {
            return false;
        }
        if (isValid(board, row - 2, col + 1) && board[row - 2][col + 1]) {
            return false;
        }
        if (isValid(board, row - 1, col + 2) && board[row - 1][col + 2]) {
            return false;
        }
        return true;
    }
}
