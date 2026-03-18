package RECURSION.Backtracking;

public class Maze {
    // RD Maze Motion
    public static void main(String[] args) {
        System.out.println(countPaths(3,3));
        path("", 3, 3);
        
    }
    //  Returning number of paths
    // Allowed MOTION= RIGHT AND DOWNWARD ONLY
    static int countPaths(int r,int c){
        if(r==1 || c==1){  //Base Case
            return 1;
        }
        int down=countPaths(r-1,c);  //left
        int right=countPaths(r,c-1); //right

        //  Total answer
        return down+right;

    }

    // Q. PRINTING MAZE PATH

    static void path(String p,int r,int c){
        // taking a string p to return path
        
        if(r==1 && c==1){   //Base Case
            System.out.println(p);
            return ;
        }
        //  r is decreasing as 3->2->1
        // Case-1
        if(r>1){     // = not included     
            path(p+'D',r-1,c);
        }
        // Case-2
        if(c>1){
            path(p+'R',r,c-1);
        }
    }

    
}
