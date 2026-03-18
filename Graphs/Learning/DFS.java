 package Graphs.Learning;

import java.util.*;

public class DFS {

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

        int V = scn.nextInt();  // number of vertices
        int E = scn.nextInt();  // number of edges

        // Step 1: Create adjacency list
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }

        // Step 2: Take edges input
        for (int i = 0; i < E; i++) {
            int u = scn.nextInt();
            int v = scn.nextInt();

            adjList.get(u).add(v);
            adjList.get(v).add(u); // undirected graph
        }

        // Step 3: DFS Traversal (starting from node 0 for now)
        boolean[] visited = new boolean[V];
        dfsTraversal(adjList, 0, visited);

        scn.close();
    }

    static void dfsTraversal(List<List<Integer>> adj, int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfsTraversal(adj, neighbor, visited);
            }
        }
    }
}
