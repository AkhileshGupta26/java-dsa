package BinarySearch;

public class Mountain1 {
    // ASC->DEC->DEC
    // ASC->DEC
    // Also known as bitonic array
    public static void main(String argu[]){
        int []nums={10,12,14,16,15,14};
        int ans=peak_element_mountain_array(nums);
        System.out.println(ans);

    }
    static int peak_element_mountain_array(int[] nums){
        int start=0;
        int end=nums.length-1;

        while(start< end){
            int mid=start+(end-start)/2;
            if(nums[mid]<nums[mid+1]){ //In ascending part 
                start=mid+1;
            }
            else{
                end=mid;
            }

        }
        return start;
        //  or return end;
        // Returning index not value

    }
    
}
