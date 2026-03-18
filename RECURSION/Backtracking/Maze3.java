package RECURSION.Backtracking;

public class Maze3 {
    // MAZE WITH OBSTACLE PROBLEM
    public static void main(String argu[]){
        boolean [][] board={
            {true,true,true},
            {true,false,true},
            {true,true,true},
        };
        // false represent  an obstacle
        //  r and  deprnd on board size
        pathWithObstacles("",board,0,0);

    }
    static void pathWithObstacles(String p,boolean[][] maze,int r,int c){

        if(r==maze.length-1 && c==maze[0].length-1){   //Base Case
            System.out.println(p);
            return ;
        }

        // Obstacle case
        // if false simply return
        if(!maze[r][c]){
            return;
        }

        // Diagonal case

        // if(r>1 && c>1){
        //     pathWithObstacles(p+'D',maze,r-1,c-1);

        // }

        // Case-1
        // < because r and c starts from 0
        if(r<maze.length-1){       
            pathWithObstacles(p+'D',maze,r+1,c);
        }
        // Case-2
        if(c<maze[0].length-1){
            pathWithObstacles(p+'R',maze,r,c+1);
        }
        
    }

    
}
