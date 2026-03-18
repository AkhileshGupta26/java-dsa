package STACK.Questions;

public class nextGreaterElem {

    // O(n^2) approach

    public static void main(String[] args) {
        int[] arr={1,3,2,8,6,3,4};
        int [] res= new int[arr.length];
        
        for(int i=0;i<arr.length;i++){
            //  loop tofind next greater element
            for(int j=i+1;j<res.length;j++){
                res[i]=-1;
            
                if(arr[j]>arr[i]){// agar greater hai toh res me store kro
                    res[i]=arr[j];
                    break;
                }
            }
        }
        // printing original array
        for(int a:arr){
            System.out.print(a+" ");
        }
        System.out.println();
        //  printing result array
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
         
    }
    
}
