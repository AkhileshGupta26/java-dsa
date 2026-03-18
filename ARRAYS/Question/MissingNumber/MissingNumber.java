package Question.MissingNumber;

public class MissingNumber {
    public static void main(String[] args) {
        // Find the missing number in an array of integers from 1 to n
        int [] nums={1,2,4,5};
        missingNumber(nums);

    }
    public static void missingNumber(int [] nums){
        int flag=0;
        for(int i=0;i<=nums.length-1;i++){
             for(int j=0;j<=nums.length-1;j++){
                if(nums[j]==i){
                    flag=1;
                    break;
                }
                else{
                    flag=0;
                }
             }
             if(flag==0){
                System.out.println("Missing number is: "+i);
                break;
             }
        }
    }
    
}
