package LinkedList.InBuildLL;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        // Adding elements to the linked list
        ll.add(1);
        ll.add(2);
        ll.add(3);
        
        System.out.println(ll);
        // Adding an element at the first position
        ll.addFirst(10);
        System.out.println(ll);
        // Adding an element at the last position
        ll.addLast(20);
        System.out.println(ll);

        // Adding an element at a specific index
        ll.add(2, 15); // Adds 15 at index 2
        System.out.println(ll);

        // Removing elements from the linked list
        ll.remove(2); // Removes the element at index 2
        System.out.println(ll);

        ll.removeFirst(); // Removes the first element
        ll.removeLast(); // Removes the last element
        System.out.println(ll);

        // Getting elements from the linked list
        int firstElement = ll.getFirst(); // Gets the first element
        int lastElement = ll.getLast(); // Gets the last element
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);

        ll.hashCode(); // Returns the hash code value for this list
        System.out.println("Hash Code: " + ll.hashCode());

        // Checking if the linked list is empty
        boolean isEmpty = ll.isEmpty(); // Checks if the list is empty
        System.out.println("Is the list empty? " + isEmpty);

        // Getting the size of the linked list
        int size = ll.size(); // Gets the size of the list
        System.out.println("Size of the list: " + size);

        // Checking if the linked list contains a specific element
        boolean containsElement = ll.contains(2); // Checks if the list contains 2
        System.out.println("Does the list contain 2? " + containsElement);
    
    }
    
}
