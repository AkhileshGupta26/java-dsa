package RECURSION.Backtracking2;

 public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));
    }

    // Function to return the number of ways
    static int queens(boolean[][] board, int row) {
        // Base Case
        if (row == board.length) {
            display(board);
            return 1;
        }

        // Placing the queen for row and col
        int count = 0;
        for (int col = 0; col <= board.length-1; col++) {
            // Place queen if it is safe
            if (issafe(board, row, col)) {
                board[row][col] = true;
                // if safe otherwise row+1
                count += queens(board, row + 1);
                // Backtrack: remove the queen
                board[row][col] = false;
            }
        }
        return count;
    }

    // Creating ISSAFE function

    static boolean issafe(boolean[][] board, int row, int col) {
        // Check vertical column
        for (int i = 0; i <= row-1; i++) {
            if (board[i][col]) {   // true
                return false;
            }
        }

        // Check left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) {
                return false;
            }
        }

        // Check right diagonal
        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j]) {
                return false;
            }
        }

        return true;
    }

    // Display the board
    static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("x ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}