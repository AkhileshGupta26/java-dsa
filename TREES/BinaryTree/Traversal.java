package TREES.BinaryTree;

public class Traversal {
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

        preorder(root);
        System.out.println();
        
        inorder(root);
        System.out.println();
        postorder(root);

        System.out.println();
        nthLevel(root,1);
        System.out.println();
        nthLevel(root,2);
        System.out.println();
        nthLevel(root,3);
        System.out.println();

        int level=height(root)+1;
        // Using loop to print nth level of the tree
        for(int i=1;i<=level;i++){
            System.out.println("Level "+i+" of the tree: ");
            nthLevel(root,i);
            System.out.println();
        }
         
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
        // Root->Left->Right
        // Base case
        if(root==null){ 
            return;
        }
        System.out.print(root.value+" ");
        // Preorder traversal of left subtree
        preorder(root.left);
        // Preorder traversal of right subtree
        preorder(root.right);
        
    }
    public static void inorder(Node root){
        // Left->Root->Right
        // Base case
        if(root==null){ 
            return;
        }
         
        // Preorder traversal of left subtree
        inorder(root.left);
        System.out.print(root.value+" ");
        // Preorder traversal of right subtree
        inorder(root.right);
        
    }
    public static void postorder(Node root){
        // Root->Left->Right
        // Base case
        if(root==null){ 
            return;
        }
    
        System.out.print(root.value+" ");
        // Preorder traversal of left subtree
        postorder(root.left);
        // Preorder traversal of right subtree
        postorder(root.right);
        
    }

    public static void nthLevel(Node root,int n){
        // Root->Left->Right
        // Base case
        if(root==null){ 
            return;
        }
        if(n==1){
            System.out.print(root.value+" ");
            return;
        }
        System.out.print(root.value+" ");
        // Preorder traversal of left subtree
        nthLevel(root.left,n-1);
        // Preorder traversal of right subtree
        nthLevel(root.right,n-1);
        
    }
    public static int height(Node root){
        return(root==null)?-1:1+Math.max(height(root.left),height(root.right));
    }
    
}
