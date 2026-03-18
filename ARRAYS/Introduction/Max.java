package Introduction;

import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int [] nums={2,4,6,8,4,1};
        int Max=Arrays.stream(nums).max().getAsInt();
        System.out.println(Max);

        // FIND CEIL DIVISION

        int ceil = (int) Math.ceil((double) Max / 2);
        System.out.println(ceil);

        // OR
        int a=10;
        int b=3;
        int ceil2=(a+b-1)/2;
        System.out.println(ceil);

    }
    
}
