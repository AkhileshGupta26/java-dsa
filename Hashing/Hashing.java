package Hashing;
import java.util.Scanner;

public class Hashing {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n;
        n=scn.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i]=scn.nextInt();
        }
        int [] hash=new int[100];
        for(int i=0;i<=n-1;i++){
            hash[arr[i]]++;
        }
         int q;  // Reads no of queries
        q = scn.nextInt();
        while (q-- != 0) {
            int number;
            number = scn.nextInt();
            // fetching:
            System.out.println(hash[number]);
        }
    }
    }
    

