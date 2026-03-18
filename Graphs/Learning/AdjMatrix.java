package Graphs.Learning;
import java.util.Arrays;
import java.util.Scanner;

public class AdjMatrix {
    public static void main(String[] args) {

        /*

         V E           // V = number of vertices, E = number of edges
         u1 v1         // edge between u1 and v1
         u2 v2
         ...
         uE vE

         */

         Scanner scn=new Scanner(System.in);

         int V=scn.nextInt();  //Number of vertices
         int E=scn.nextInt();  //Number of Edges

          int[][] adjMatrix = new int[V][V];

        //  Taking Nodes pair input

        for(int i=0;i<E;i++){
            int u=scn.nextInt();
            int v=scn.nextInt();
            
            adjMatrix[u][v] = 1;
            adjMatrix[v][u] = 1; // undirected graph
        }

        System.out.println(Arrays.deepToString(adjMatrix));
        scn.close();
        
        /*
         
         INPUT
         5 6
         0 1
         0 4
         1 2
         1 3
         1 4
         2 3

         */

        
    }
    
}
