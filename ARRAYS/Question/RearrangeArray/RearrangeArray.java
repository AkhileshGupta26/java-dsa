package Question.RearrangeArray;

import java.util.ArrayList;


public class RearrangeArray {
    public static void main(String[] args) {

        int [] nums = {3,1,-2,-5,2,-4};

        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        for(int a:nums){
            if(a<0){
                list1.add(a);
            }else{
                list2.add(a);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=list2.get(i/2);
            }else{
                nums[i]=list1.get(i/2);
            }
        }
        System.out.print("Rearranged Array: ");
        for(int a:nums){
            System.out.print(a + " ");
        }

        
    }
    
}
