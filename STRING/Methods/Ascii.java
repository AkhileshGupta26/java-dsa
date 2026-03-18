package STRING.Methods;

public class Ascii {
    public static void main(String[] args) {
        char uppercase = 'A'; // Example uppercase letter
        char lowercase = (char) (uppercase + 32); // Convert to lowercase
        System.out.println("Uppercase: " + uppercase);
        System.out.println("Lowercase: " + lowercase);
        System.out.println('A'+(-65));

        // ASCII FINDING
        System.out.println("ASCII value of A: " + (int) 'A');
        System.out.println("ASCII value of a: " + (int) 'a');

        int c1=s.charAt(0);
        System.out.println(c1);
        
    }
    // ASCII A to Z= 65 -> 90
    // ASCII a to z= 97 -> 122
    // Difference = 32
    // Lowercase ASCII Value=Uppercase ASCII Value+32
    


    
}
