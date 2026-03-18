package Sorting;

public class CyclicSort {
    public static void main(String argu[]){
        int [] arr={3,5,2,1,4};
        sort(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }
    // Necessary Condition Numbers given from 1 to N
static void sort(int []arr){
    int i=0;
    while(i<=arr.length-1){
        int correct= arr[i]-1;
        if(arr[i]!=arr[correct]){
            //swap
            swap(arr,i,correct);
        }
        else{
            i++;
        }
    }
}
public static void swap(int[]arr,int i,int j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}
}
    
    
 
    
