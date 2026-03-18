package RECURSION.String;
import java.util.ArrayList;;

public class Dice {
    public static void main(String argu[]){
        dice("",4);
        System.out.println(diceRet("",5));

    }
    static void dice(String p,int target){
        // base case
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=6 && i<=target;i++){
            dice(p+i,target-i);  //take it

        }
    }

    // Returning as ArrayList
    static ArrayList<String> diceRet(String p,int target){
        // base case
        if(target==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();

        for(int i=1;i<=6 && i<=target;i++){
            list.addAll(diceRet(p+i,target-i));  //take it
        }
        return list;
    }
    
}
