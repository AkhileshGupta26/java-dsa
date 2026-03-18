package TREES.BinaryTree;

public class PreorderTrav {
    static int count=0;
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
        preorder(root);
        System.out.println("Preorder Traversal Count: "+count);
        System.out.println("Size of the tree: "+size(root));
        System.out.println("Sum of the tree: "+sum(root));
    }
    public static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }
    public static void preorder(Node root){
        if(root==null){ //Base case
            return;
        }
        count++;
        preorder(root.left);    
        preorder(root.right);
    }
    // public static int size(Node root) {
    //     return (root == null) ? 0 : 1 + size(root.left) + size(root.right);
    // }
    // public static int sum(Node root) {
    //     return (root == null) ? 0 : root.value+sum(root.left) + sum(root.right);
    // }
    // public static int max(Node root){
    //     return (root == null) ? Integer.MIN_VALUE : Math.max(root.value, Math.max(max(root.left), max(root.right)));

    // }
    // public static int height(Node root) {
    //     return (root == null) ? -1 : 1 + Math.max(height(root.left), height(root.right));
    //   }
}
