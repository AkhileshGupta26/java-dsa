package MATHS;
import java.util.Scanner;

public class ternary {
 public static void main(String[] args) {
        // condition ? true : false
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
       //   Storing ternary value
        String message = (age >= 18) ? "Adult" : "Minor";
        System.out.println("You are an " + message);
 }

}
