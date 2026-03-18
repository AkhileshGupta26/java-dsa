package STRING.AdvMethods;

import java.util.StringTokenizer;
/*
 *  # StringTokenizer class in Java is used to break a string
 *     into tokens based on delimiters.
 *  # A delimiter is a character or set of characters that 
 *     separate tokens in the string.
 */

public class Tockenizer {
    public static void main(String[] args) {
        String str = "Java is powerful";
        /*
         *  // Create a StringTokenizer object 
            // with space as the delimiter
            
            The hasMoreTokens() method checks there are more tokens available 
            to process or not. The nextToken() method get the next token
             (substring).
         */
        StringTokenizer st = new StringTokenizer(str);
        System.out.println("String: " + st.nextToken());

        int count = st.countTokens(); // Count the number of tokens
        System.out.println("Number of tokens: " + count);
        st.nextToken(); // Skip the first token
        System.out.println("After skipping the first token: " + st.countTokens());
        st.nextElement(); // Skip the first token
        System.out.println("After skipping the first token: " + st.countTokens());
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
    
}
