package RECURSION.String;

public class rem_char {

    // Remove all 'a' from the string
    // Input: abcad
    // Output: bcd
    public static void main(String argu[]){
        rem("", "abcad");
         
         String result=rem("baccad");
         System.out.println(result);

            String result2=remApple("applebaccadapple");
            System.out.println(result2);

    }
    static void rem(String p,String up){   // METHOD 1
        // Taking as argument
        // p: processed string
        // up: unprocessed string
        if(up.isEmpty()){           // BASE CASE
            System.out.println(p);
            return;
        }
         char ch=up.charAt(0);

        if(ch =='a'){
            // skip p:same up:skip a
            rem(p, up.substring(1));
         }
        else{
            // include p:ch up:skip ch
            rem(p+ch, up.substring(1));
         }
        }

     static String rem(String up){  // METHOD 2
            // p: processed string
            // up: unprocessed string
            // Base case
            if(up.isEmpty()){
                return "" ;
            }
             char ch=up.charAt(0);
    
             if(ch =='a'){
                // if equals to a then skip
                 return rem(up.substring(1));
             }
             else{
                // include p:ch up:skip ch
                 return ch + rem(up.substring(1));
             }
    }

    // Q2 . Remove apple from a string
    static String remApple(String up){  // METHOD 2
        // p: processed string
        // up: unprocessed string
        // Base case
        if(up.isEmpty()){
            return "" ;
        }

        if(up.startsWith("apple")){
            // if equals to a then skip the  length of apple -1 
            // apple length is 5 skipping 5-1=4 , start with 5th index
            return remApple(up.substring(5));
        }
         else{
            // include p:ch up:skip ch
             return up.charAt(0) + rem(up.substring(1));
         }
    }

    // Q3. skip app not apple
     static String rem2(String up){  // METHOD 2
            // p: processed string
            // up: unprocessed string
            // Base case
            if(up.isEmpty()){
                return "" ;
            }
             char ch=up.charAt(0);
    
             if(ch =='a'){
                // if equals to a then skip
                 return rem2(up.substring(1));
             }
             else{
                // include p:ch up:skip ch
                 return ch + rem2(up.substring(1));
             }
    } 
    
//     static String remAppNotApple(String up){  // METHOD 2
//         // p: processed string
//         // up: unprocessed string
//         // Base case
//         if(up.isEmpty()){
//             return "" ;
//         }
//         if(up.startsWith("app") && !up.startsWith("apple")){
//             return remAppNotApple(up.substring(3));
//          else{
//             // include p:ch up:skip ch
//              return ch + rem(up.substring(1));
//          }
//         }
// }

}
