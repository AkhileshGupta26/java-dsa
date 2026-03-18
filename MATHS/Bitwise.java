package MATHS;

public class Bitwise {
    public static void main(String[] args) {
        // Bitwise AND operator
        int a = 5; // 0101 in binary
        int b = 3; // 0011 in binary
        int andResult = a & b; // 0001 in binary, which is 1 in decimal
        System.out.println("Bitwise AND: " + andResult); // Output: 1

         System.out.println(1001^1); 
        // Every number is converted to binary and then the operation is performed on the binary number.

        //(1)  Binary N & 1 = N; 

        // N & 1 = 0; // N is even
        // N & 1 = 1; // N is odd
        
        
        //(2)  N ^ 1 = ~N;
        //(3)  N ^ 0 = N;
        //(4)  N ^ N = 0;
        
        //(5) N << 1 = N * 2;
        //(6) N >> 1 = N / 2;
        //(7) N << 2 = N * 4;
        //(8) N << X = N * 2^X;

        
    }
     
    
    
}
