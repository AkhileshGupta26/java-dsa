package STRING.Introduction;

public class Comparision {
    public static void main(String argu[]){
        // Creating string inside string pool
        String a="Akhil";
        String b="Akhil";
        String e="Ahyam";

        // == Method
        // Compare both value and it must be inside pool
        System.out.println(a==b); // true


        // Creating string outside string pool
        String c=new String("Akhil");
        String d=new String("Akhil");
        System.out.println(c==d); // false

        // .equals Method
        // compar value only
        System.out.println(c.equals(d)); // true

        // .compareTo  Method
        System.out.println(a.compareTo(e));  //3
        System.out.println(a.compareTo(b));   //0


        // Float magic
        float x=453.1274f;
        System.out.println(x); // 453.1274

        System.out.printf("%.2f",x); // 453.13
        //  Also  round off the number
        System.out.printf("%.3f",x); // 453.127
    }
    
}
