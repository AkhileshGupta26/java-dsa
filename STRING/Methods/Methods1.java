package STRING.Methods;

public class Methods1 {
    // str.method();
    public static void main(String argu[]){
        String str="Hello";
        String str2="Hello";
         
        // [1] length() method
        System.out.println(str.length());

        // [2] charAt() method
        System.out.println(str.charAt(0));

        // [3] substring() method
        // substring(int start, int end);
        //  start is inclusive and end is exclusive

        System.out.println(str.substring(1, 3));


        // [4] indexOf() method
        // Zero based indexing
        System.out.println(str.indexOf("l"));

        // [5] string.join() method
        String s1= String.join("",str);
        System.out.println(s1);

        // equals() method
        System.out.println(str.equals(str2));

    }
    
}
