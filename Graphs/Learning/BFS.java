import java.util.*;

public class BFS {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int V = scn.nextInt();  // number of vertices
        int E = scn.nextInt();  // number of edges

        List<List<Integer>> adjList = new ArrayList<>();
        // Making V number of new list
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }

        // Adding elements to these lists
        for (int i = 0; i < E; i++) {
            int u = scn.nextInt();
            int v = scn.nextInt();

            adjList.get(u).add(v);
            adjList.get(v).add(u); // undirected graph
        }

        boolean[] visited = new boolean[V];
        
        // It can differ for different cases
        
        // Run BFS for all components
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                bfsTraversal(adjList, V, i, visited);
            }
        }

        scn.close();
    }

    static void bfsTraversal(List<List<Integer>> adj, int V, int start, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start); //this ensure starting point of bfs traversal

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
}
