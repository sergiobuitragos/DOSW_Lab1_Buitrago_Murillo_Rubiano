package challenge4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Challenge4 {

    //A - HashMap
    public static void addToHashMap(Map<String, Integer> map, String key, Integer value) {
        if (!map.containsKey(key)) {
            map.put(key, value);
        }
    }

    //B - Hashtable
    public static void addToHashtable(Hashtable<String, Integer> table, String key, Integer value) {
        if (!table.containsKey(key)) {
            table.put(key, value);
        }
    }

    //Combine both maps, Hashtable wins on duplicates,
    //converts keys to uppercase, sorts ascending
    public static Map<String, Integer> mergeMaps(Map<String, Integer> hashMap,
                                                  Hashtable<String, Integer> hashTable) {
        return Stream.concat(hashTable.entrySet().stream(), hashMap.entrySet().stream())
                .collect(Collectors.toMap(
                        entry -> entry.getKey().toUpperCase(),
                        Map.Entry::getValue,
                        (existing, replacement) -> existing,
                        () -> new java.util.TreeMap<>()
                ));
    }

    public static void main(String[] args) {
        //HashMap entries
        HashMap<String, Integer> hashMap = new HashMap<>();
        addToHashMap(hashMap, "gold", 5);
        addToHashMap(hashMap, "silver", 3);
        addToHashMap(hashMap, "gold", 7);    // ignored
        addToHashMap(hashMap, "diamond", 10);

        //Hashtable entries
        Hashtable<String, Integer> hashTable = new Hashtable<>();
        addToHashtable(hashTable, "silver", 8);
        addToHashtable(hashTable, "ruby", 4);
        addToHashtable(hashTable, "gold", 12);
        addToHashtable(hashTable, "emerald", 6);

        //Merge and print
        Map<String, Integer> result = mergeMaps(hashMap, hashTable);
        result.forEach((key, value) ->
                System.out.println("Key: " + key + " | Value: " + value));
    }
}