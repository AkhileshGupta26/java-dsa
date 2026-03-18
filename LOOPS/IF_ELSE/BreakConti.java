package LOOPS.IF_ELSE;

public class BreakConti {
    public static void main(String[] args) {
        // break statement is used to exit a loop or switch statement
        // continue statement is used to skip the current iteration of a loop and continue with the next iteration

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // exits the loop when i is 5
            }
            System.out.println(i); // prints numbers from 0 to 4
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue; // skips the current iteration when i is 5
            }
            System.out.println(i); // prints numbers from 0 to 9 except 5
        }
    }
    
}
