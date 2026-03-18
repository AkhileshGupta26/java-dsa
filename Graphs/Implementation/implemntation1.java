package Graphs.Implementation;
import java.util.*;
public class implemntation1 {
    public static void main(String[] args) {
        // Given
        List<List<Integer>> graph = Arrays.asList(
            Arrays.asList(1,2),
            Arrays.asList(2,3),
            Arrays.asList(3,4),
            Arrays.asList(4,1)
        );
        // Create an adjacency list
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0;i<graph.size();i++){
             int a=graph.get(i).get(0);
             int b=graph.get(i).get(1);
             adjList.set(a,b)=1;
             adjList.set(b, new ArrayList<>());
        }
        


    }
    
}
