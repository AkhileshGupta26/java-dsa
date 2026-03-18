package STACK.Questions;

import java.util.Stack;

public class nextGreaterElement {
    public static int[] findNextGreater(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Start from the last element
        for (int i = n - 1; i >= 0; i--) {
            // Remove all elements smaller than or equal to arr[i]
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // If stack is empty, no greater element to the right
            nge[i] = stack.isEmpty() ? -1 : stack.peek();

            // Push current element onto stack
            stack.push(arr[i]);
        }

        return nge;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        int[] result = findNextGreater(arr);

        System.out.println("Next Greater Elements:");
        for (int i = 0; i < result.length; i++) {
            System.out.println(arr[i] + " -> " + result[i]);
        }
    }
}
   

