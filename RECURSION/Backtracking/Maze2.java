package RECURSION.Backtracking;

public class Maze2 {
    // Right Down Diagonal Motion
    public static void main(String argu[]){
        path("",3,3);
        countPaths(3,3);

    }
     static int countPaths(int r,int c){
        if(r==1 || c==1){  //Base Case
            return 1;
        }
        int left=countPaths(r-1,c);  //left
        int right=countPaths(r,c-1); //right
        // int diagonal=countPaths(r-1,c-1);

        //  Total answer
        return left+right;

    }
     // Q. PRINTING MAZE PATH MOTION 'H''V''D'

     static void path(String p,int r,int c){
        if(r==1 && c==1){   //Base Case
            System.out.println(p);
            return ;
        }
        // Diagonal case 
        //  Included both case at same time
        if(r>1 && c>1){
            path(p+'D',r-1,c-1);

        }
        // Case-1
        if(r>1){       
            path(p+'V',r-1,c);
        }
        // Case-2
        if(c>1){
            path(p+'H',r,c-1);
        }
    }
}
