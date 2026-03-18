package STRING.TwoPointer;

public class Palindrome {
    public static void main(String[] args) {
        String input = "abababa";
        boolean result = isPalindrome(input);
        System.out.println("Is the string \"" + input + "\" a palindrome? " + result);
    }

    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            // Skip non-alphanumeric characters
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }

            // Compare characters
            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }

            // Move pointers
            start++;
            end--;
        }

        return true;
    }
}