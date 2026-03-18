package RECURSION.Backtracking2;

public class SudokoSolver {
    public static void main(String[] args) {
        
    }
    static boolean isSafe(int[][] board,int row,int col,int num){
        // Check for row
        for(int i=0;i<=board.length-1;i++){
            // check if the number is in row or not
            if(board[row][col]==num){
                return false;
            }
        }
        // Check for column
        for( int[]nums:board){
            // check if the number is in col or not
            if(nums[col]==num){
                return false;
            }
        }
        int  sqrt= (int)(Math.sqrt(board.length));
        int rowStart= row-row%sqrt;
        int colStart=  col -col%sqrt;
        for(int r= rowStart;r<=rowStart+sqrt-1;r++){
            for(int c=colStart;c<=colStart+sqrt-1;c++){
                if(board[r][c]==num){
                    return false;
                }

            }
        }
        return true;
    }
    
}
