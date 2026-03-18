package Introduction;
import java.util.*;
public class arraylist2 {
    public static void main(String[] args) {


        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        list.add(1, 50);
        System.out.println(list);
        list.remove(Integer.valueOf(50));
        System.out.println(list);
        list.set(1,50);
        System.out.println(list);
        System.out.println(list.subList(1,2));
        System.out.println(list.indexOf(50));
        
    }
    
}
