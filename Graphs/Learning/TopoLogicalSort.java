import java.util.*;
public class TopoLogicalSort {

    public static void main(String[] args) {
        int V=6;
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();

        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        adj.get(2).add(3);
        adj.get(3).add(1);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(5).add(0);
        adj.get(5).add(2);



    }
    public static void dfs(int Node,int[] vis,Stack<Integer>, ArrayList<ArrayList<Integer>> adj){
        vis[node]=1;
        for(int it:)

    }
    
}
