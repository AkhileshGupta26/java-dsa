package STRING.StringBuilder;

public class Introduction {
    public static void main(String argu[]){

        // Stringbuilder is mutable

        // Declaration
        StringBuilder sb=new StringBuilder("Hello");
        System.out.println(sb);

        // charAt() method
        System.out.println(sb.charAt(0));

        // setCharAt() method
        sb.setCharAt(0, 'J');
        System.out.println(sb);

        // insert() method
        // insert(int index, String str)
        sb.insert(5, "World");
        System.out.println(sb);

        // delete() method
        // delete(int start, int end)
        sb.delete(5, 10);

        // deleteCharAt() method
        sb.deleteCharAt(0);

        // append() method
        sb.append("World");
        
        System.out.println(sb);



        // Converting sb=> to string
        //  sb.toString()

        // iterating through stringbuilder
        for(int i=0;i<sb.length();i++){
            System.out.print(sb.charAt(i)+" ");
        }
        System.out.println();


    }
    
}
