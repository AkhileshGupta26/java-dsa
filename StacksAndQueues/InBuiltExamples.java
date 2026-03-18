package StacksAndQueues;

import java.util.*;

public class InBuiltExamples {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.push(34));
        System.out.println(stack.push(45));
        System.out.println(stack.push(2));
        System.out.println(stack.push(9));
        System.out.println(stack.push(18));

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        // System.out.println(stack.pop());

        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(6);
        queue.add(5);
        queue.add(19);
        queue.add(1);
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.addLast(78);
        deque.removeFirst();
        // etc etc
    }
}