package STACK.Introduction;
import java.util.Stack;

public class Basic {
    public static void main(String argu[]){

        // LIFO - Last In First Out and FILO - First In Last Out
        // TC=O(1) for all operations

        // Declaration
        Stack<Integer> stk = new Stack<>();//An empty statck is created

        // Pushing elements
        stk.push(5);
        stk.push(10);
        stk.push(15);
        stk.push(20);

        // peek() - returns the top element of the stack
        System.out.println("Top element is: "+stk.peek());

        // Printing the stack
        System.out.println("Elements in stack: "+stk);

        // pop() - removes the top element of the stack
        stk.pop();
        System.out.println("Elements in stack after pop: "+stk);

        // size() - returns the size of the stack
        System.out.println("Size of stack: "+stk.size());

        while(stk.size()>1){
            stk.pop();
        }
        System.out.println(stk.peek());
        System.out.println(stk);

        // isempty() - returns true if stack is empty else false
        System.out.println("Is stack empty: "+stk.isEmpty());




    }

    
}
