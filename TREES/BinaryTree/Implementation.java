package TREES.BinaryTree;

public class Implementation {

    public static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(2);

        Node a= new Node(4);
        Node b= new Node(10);
        root.left = a;

        root.right = b;

        Node c=new Node(6);
        a.left=c;
        Node d=new Node(5);
        a.right=d;
        Node e=new Node(11);
        b.right=e;
        display(root);
        
    }   
    public static void display(Node root){
        if(root==null){ //Base case
            return;
        }
        System.out.print(root.value+" ->");
        if(root.left!=null){
            System.out.print(" left: "+root.left.value+" ,");
        }else{
            System.out.print(" left: null ,");
        }
        if(root.right!=null){
            System.out.print(" right: "+root.right.value+" ,");
        }else{
            System.out.print(" right: null ,");
        }
        // System.out.print(root.left.value+" ,");
        // System.out.println(root.right.value+" ");
        display(root.left);
        display(root.right);

    }
    
}
