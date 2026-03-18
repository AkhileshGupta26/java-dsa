package STACK.Introduction;
import java.util.Scanner;
import java.util.Stack;

public class CopyStackInStack {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();

        Scanner scn = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter the number of elements you want to enter in stack: ");
        int n = scn.nextInt();
        System.out.println("Enter the elements: ");     
        for(int i=0;i<n;i++){
            stk.push(scn.nextInt());
        }

        System.out.println(stk);

        // Copying the stack into another stack
        Stack<Integer> stk2 = new Stack<>();
        Stack<Integer> stk3 = new Stack<>();

        while(stk.size()>0){
            stk2.push(stk.pop());
         }
            System.out.println(stk2);
           while(stk2.size()>0){
            stk3.push(stk2.pop());
         } 
         System.out.println(stk3);


    }

    
}
