package HashMap.HashSet;
import java.util.HashSet;
import java.util.Iterator;
/* 
 *  # HashSet is a collection that contains no duplicate elements.
 *  # It is part of the Java Collections Framework and implements the Set interface.
 *  # HashSet is unordered, meaning it does not guarantee the order of elements.
 *  # It allows null values and is not synchronized.
 *  # The time complexity for basic operations (add, remove, contains) is O(1) on average.
 */

public class Basic {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(); // Create a HashSet

        // adding elements to the HashSet
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);

        // Searching for an element in the HashSet
        if (set.contains(2)) {
            System.out.println("Set contains 2");
        } else {
            System.out.println("Set does not contain 2");
        }
        set.remove(2); // Remove an element from the HashSet
        System.out.println("Set after removing 2: " + set); // Print the HashSet

        // size() - returns the number of elements in the HashSet
        System.out.println("Size of set: " + set.size());

        // Iterating through the HashSet
        System.out.println("Elements in set:");
        for (Integer element : set) {
            System.out.println(element);
        }

        // Iterator
        Iterator iterator = set.iterator(); 

        // hasNext() - checks if there are more elements to iterate
        // next() - returns the next element in the iteration
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // USE EXTRA SPACE  AND REDUCE TIME COMPLEXITY 
add()      -> O(1)
contains() -> O(1)
remove()   -> O(1)


    }
    
}
