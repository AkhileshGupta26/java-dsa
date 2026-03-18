package MATHS;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=scn.nextInt();
        // Using bitwise operator to check even or odd
        // N & 1 = 0; // N is even
        // N & 1 = 1; // N is odd
        
        System.out.println((n & 1) == 0 ? "Even" : "Odd");
        
    }
    
}
