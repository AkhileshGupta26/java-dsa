package MATHS;

public class FindUnique {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 2, 1};
        int count = 0;
        for(int i:nums){
            count = count ^ i; // XOR operation
            System.out.println(count);

        }
    }
    
}
