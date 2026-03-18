package STRING.Introduction;

public class intcharconv {
    public static void main(String[] args) {
        String str = "5375";

        for (int i = 0; i < str.length(); i++) {
                 char ch = str.charAt(i);      // Get char
                 int num = ch - '0';           // Convert to int
                //  + '0' to convert int to char
                
                System.out.println("char: " + ch + ", int: " + num);
      }
      int x=Integer.parseInt(str);
      System.out.println(x);

    }    
    
}
