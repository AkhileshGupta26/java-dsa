package RECURSION.Backtracking;

public class Maze4 {
    // TAKING ALL PATH 
    public static void main(String argu[]){
        boolean [][] board={
            {true,true,true},
            {true,true,true},
            {true,true,true},
        };
        allPath("",board,0,0);

    }
    static void allPath(String p,boolean[][] maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){   //Base Case
            System.out.println(p);
            return ;
        }

        // Obstacle case
        if(!maze[r][c]){
            return;
        }
        
        // I am considering this block in my path
        maze[r][c]=false;


        // Case-1
        if(r<maze.length-1){       
            allPath(p+'D',maze,r+1,c);
        }
        // Case-2
        if(c<maze[0].length-1){
            allPath(p+'R',maze,r,c+1);
        }
        // Case-3
        if(r>0){
            allPath(p+'U',maze,r-1,c);
        }
        // Case-4
        if(c>0){
            allPath(p+'L',maze,r,c-1);
        }

        // At return position .Where  fcn will be over
        //  so before the fcn gets remove also remove the changes that are made by this fcn
        maze[r][c]=true;
    }
    
}
