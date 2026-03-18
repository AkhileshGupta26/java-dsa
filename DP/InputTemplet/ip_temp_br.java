 import java.io.*;
import java.util.*;

package DP.InputTemplet;
public class ip_temp_br {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());  // test cases

        while (t-- > 0) {

            int n = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            // write your logic here
        }
    }
}
    

