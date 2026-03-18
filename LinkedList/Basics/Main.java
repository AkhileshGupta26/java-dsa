package LinkedList.Basics;

public class Main {
    public static void main(String[] args) {
        LL ll = new LL();

        // Adding elements to the linked list

        
    }
    // Linked List Implementation
    // 1. Node Class
    // 2. Linked List Class
    // 3. Constructor
    
    public static  class LL{
    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size=0;
    }
    
    }
    private class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
        public Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
        
    }
    
}
