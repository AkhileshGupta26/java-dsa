package STRING.AdvMethods;

public class regex {
    public static void main(String[] args) {
        // TO SPLIT STRING
        String str = "Hello,World,   Java";
        String[] parts = str.split("\\s+");
        for (String part : parts) {
            System.out.println(part);
        }
    }

    // split() method return an array of substrings
    
}
