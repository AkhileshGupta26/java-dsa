package TREES.BinaryTree;

public class SizeMaxSumHeight {
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
        // display(root);
        // System.out.println("Size of the tree: "+size(root));
        System.out.println("Max of the tree: "+max(root));
        
        
    }
    public static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }
    /*
     * 
     */
    public static int size(Node root) {
        return (root == null) ? 0 : 1 + size(root.left) + size(root.right);
    }
    public static int sum(Node root) {
        return (root == null) ? 0 : root.value+sum(root.left) + sum(root.right);
    }
    // public static int max(Node root){
    //     return (root == null) ? Integer.MIN_VALUE : Math.max(root.value, Math.max(max(root.left), max(root.right)));

    // }
    public static int max(Node root){
        // if(root==null){ //Base case
        //     return Integer.MIN_VALUE;
        // }
        // // int a=root.value;
        // // int b=max(root.left);
        // // int c=max(root.right);
        // // return Math.max(a, Math.max(b, c));
        // // OR
        // // return Math.max(root.value, Math.max(max(root.left), max(root.right)));
        // // OR   
        // // return Math.max(root.value, Math.max(max(root.left), max(root.right))); 
        // return Math.max(root.value, Math.max(max(root.left), max(root.right)));
        return (root == null) ? Integer.MIN_VALUE : Math.max(root.value, Math.max(max(root.left), max(root.right)));

    }
    public static int height(Node root) {
        return (root == null) ? -1 : 1 + Math.max(height(root.left), height(root.right));
      }

}
