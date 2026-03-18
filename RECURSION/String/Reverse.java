package RECURSION.String;

public class Reverse {
    public static void main(String[] args) {
        // Reverse the given String 
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s, 0, s.length - 1);
        for (char c : s) {
            System.out.println(c);
        }
    }

    static void reverseString(char[] s, int start, int end) {
        if (start >= end) {
            return;
        }
        swap(s, start, end);
        reverseString(s, start + 1, end - 1);
    }

    static void swap(char[] s, int start, int end) {
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
    }
}
