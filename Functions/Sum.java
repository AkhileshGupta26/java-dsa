package Functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // sum();
        sum(5,7);
        System.out.println("Sum="+sum(5,7));
        
      
    }

    static int sum(int a,int b){
        return a+b;
        System.out.println("Khatam over tata bye bye");
    }
    
    static void sum(){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a=scn.nextInt();
        System.out.println("Enter the second number: ");
        int b= scn.nextInt();
        int sum=a+b;
        System.out.println("Sum="+sum);


    }
}
