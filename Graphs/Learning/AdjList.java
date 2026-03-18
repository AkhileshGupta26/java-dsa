 package Graphs.Learning;

import java.util.*;

public class AdjList {

    public static void main(String[] args) {
        /*
         Input Format:
         V E           // V = number of vertices, E = number of edges
         u1 v1         // edge between u1 and v1
         u2 v2
         ...
         uE vE
        */

        Scanner scn = new Scanner(System.in);

        int V = scn.nextInt();  // Number of vertices
        int E = scn.nextInt();  // Number of edges

        // Create adjacency list equal to vertices
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }

        // Take edges input
        for (int i = 0; i < E; i++) {
            int u = scn.nextInt();
            int v = scn.nextInt();

            adjList.get(u).add(v);
            adjList.get(v).add(u); // undirected graph
        }

        // Print adjacency list
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");
            for (int node : adjList.get(i)) {
                System.out.print(node + " ");
            }
            System.out.println();
        }

        scn.close();
    }
}
