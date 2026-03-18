package TREES.BinaryTree;
import java.util.Queue;
import java.util.LinkedList;

public class bfsTraversal {
    public static void main(String[] args) {
        Node root = new Node(1);

        Node a= new Node(2);
        Node b= new Node(3);
        root.left = a;

        root.right = b;

        Node c=new Node(4);
        a.left=c;
        Node d=new Node(5);
        a.right=d;
        Node e=new Node(6);
        b.right=e;
        bfs(root);
    }
    public static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
      }

      public static void bfs(Node root){

        Queue<Node> queue=new LinkedList<>();
        // Logic
        /*
         * (1) Add the root node to the queue.
         * (2) add it's children to the queue. checking for null,store node in temp node
         * (3) remove the node from the queue. before removing print
         * 
         */
        if(root!=null)
        queue.add(root);
        while(queue.size()>0){
            Node temp=queue.peek();
            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right!=null){
                queue.add(temp.right);
            }
            System.out.println(temp.value+" ");
            queue.remove();

        }

      }
}
