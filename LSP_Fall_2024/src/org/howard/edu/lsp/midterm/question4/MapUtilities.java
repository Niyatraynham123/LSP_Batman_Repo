package org.howard.edu.lsp.midterm.question4;
import java.util.HashMap;

/**
 * Utility class for working with HashMaps.
 */
public class MapUtilities {
    
    /**
     * Counts the number of common key/value pairs between two HashMaps.
     *
     * @param map1 The first HashMap to compare.
     * @param map2 The second HashMap to compare.
     * @return The number of common key/value pairs. Returns 0 if either map is empty.
     */
    public static int commonKeyAndValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {
        
        int count = 0; // Keeping track of common key/value pairs
        
        // Check if either map is empty
        if (map1.isEmpty() || map2.isEmpty()) {
            return 0; // Return 0 if any map is empty
        }

        // Iteration through the first map
        for (String key : map1.keySet()) {
            // Then check if the second map contains the same key and value
            if (map2.containsKey(key) && map2.get(key).equals(map1.get(key))) {
                count++; // Increment the count if both key and value match
            }
        }

        return count; // Return the total count of common key/value pairs
    }
}
