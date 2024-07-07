import java.util.*;
/*
the only necessary imports are
import java.util.HashMap;
import java.util.Map;

*/

public class program19 {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Add elements to the map
        map.put("apple", 10);
        map.put("banana", 20);
        map.put("orange", 15);

        // Display the initial map
        System.out.println("Initial Map: " + map);

        // Changing the value associated with a key
        map.put("banana", 30);
        System.out.println("Map after changing value for 'banana': " + map);

        // Remove an element from the map
        map.remove("apple");
        System.out.println("Map after removing 'apple': " + map);
        
        
        /*
        if u wants to iterate througth the elements and keys
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        */






        // Check if a key exists in the map
        if (map.containsKey("orange")) {
            System.out.println("'orange' is present in the map");
        } else {
            System.out.println("'orange' is not present in the map");
        }

        // Clear the map
        map.clear();
        System.out.println("Map after clearing: " + map);
    }
}


/*OutPUT
Initial Map: {banana=20, orange=15, apple=10}
Map after changing value for 'banana': {banana=30, orange=15, apple=10}
Map after removing 'apple': {banana=30, orange=15}
'orange' is present in the map
Map after clearing: {}
*/

