package STRING.AdvMethods;

public class isVowel {
    public static void main(String[] args) {
        String str = "Hello";
        for (char c : str.toCharArray()) {
            if (new isVowel().isVowel(c)) {
                System.out.println(c + " is a vowel.");
            } else {
                System.out.println(c + " is not a vowel.");
            }
        }
        
    }
    private boolean isVowel(char c) {
    return "aeiouAEIOU".indexOf(c) != -1;
}


    
}
