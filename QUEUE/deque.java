package QUEUE;
import java.util.*;
public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.offerFirst(10);
        dq.offerLast(20);
        dq.offerFirst(5);
        System.out.println(dq);
        dq.pollLast();
        System.out.println(dq);
    }
    
}
