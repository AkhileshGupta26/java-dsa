package HashMap.Introduction.Basic;
import java.util.HashMap;

public class Basic {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>(); // Create a HashMap

        map.put(1, "Akhil");
        map.put(2, "Akhil"); // Add key-value pairs to the HashMap
        map.put(3, "Akhil");

        System.out.println(map); // Print the HashMap

        // Optional: Print each key-value pair
        for (HashMap.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        // map.forEach((key, value) -> System.out.println(key + ":" + value));

        map.forEach((key, value) -> System.out.println(key + ":" + value));

        // 6. Load Factor & Rehashing

// Load Factor (default = 0.75) means:
// When 75% of capacity is filled, HashMap doubles its capacity.

// Formula for threshold = capacity × loadFactor

    }

}
