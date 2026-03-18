package DP;

import java.util.*;
import java.io.*;

public class codechef_templet {

class Main {
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        int T = scn.nextInt();   // number of test cases
        while (T-- > 0) {

            // ---- basic inputs ----
            int n = scn.nextInt();
            int m = scn.nextInt();      // remove if not needed
            long k = scn.nextLong();    // remove if not needed

            // ---- array input ----
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }

            // // taking i/p 2 3 4 5 6 like stream input and storing in variable x
            // int x = 0;
            // for(int i=0;i<n;i++){
            //     x+=scn.nextInt();
            // }

            // ---- string input ----
            String s = scn.next();          // single word
            // String line = scn.nextLine(); // full line (use carefully)

            // ---- solve here ----

        }

        scn.close();
    }
}
}
