package STRING.Methods;

public class Methods2 {
    public static void main(String argu[]){
        String str="Hello";
        String str2="Hello";
         
        //  [5] toCharArray() method
        char [] ch=str.toCharArray();
        System.out.println(ch);

        // [6] contains() method
        System.out.println(str.contains("el"));

        // [7] replace() method
        // replace(char oldChar, char newChar)
        System.out.println(str.replace('l', 'p'));

        // [8] reverse() method
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());

        // [9] startsWith() method and endsWith() method
        System.out.println(str.startsWith("H"));
        System.out.println(str.endsWith("o"));

        // [10] toLowerCase() method and toUpperCase() method
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        // [11] trim() method
        String str3="   Hello   ";
        System.out.println(str3.trim());

        // [12] split() method
        String str4="Hello,World";
        String [] arr=str4.split(",");
        System.out.println(str4);

        // STRING ARE IMMUTABLE , NEED TO STORE RESULT OF THESE FUNCTIONS 
        //  SO RESULT NOT GET LOST
        

        
        
    }
    
}
