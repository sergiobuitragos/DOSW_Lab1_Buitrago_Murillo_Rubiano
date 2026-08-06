package challenge4;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.TreeMap;

public class Challenge4 {

    public static void addTreasure(Map<String, Integer> map, String key, Integer value) {
        if (!map.containsKey(key)) {
            map.put(key, value);
        }
    }

    public static void addToHashtable(Hashtable<String, Integer> table, String key, Integer value) {
        if (!table.containsKey(key)) {
            table.put(key, value);
        }
    }

    public static Map<String, Integer> mergeMaps(Map<String, Integer> hashMap,
                                                  Hashtable<String, Integer> hashTable) {
        return Stream.concat(hashTable.entrySet().stream(), hashMap.entrySet().stream())
                .collect(Collectors.toMap(
                        entry -> entry.getKey().toUpperCase(),
                        Map.Entry::getValue,
                        (existing, replacement) -> existing,
                        TreeMap::new
                ));
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        addTreasure(hashMap, "gold", 5);
        addTreasure(hashMap, "silver", 3);
        addTreasure(hashMap, "gold", 7);
        addTreasure(hashMap, "diamond", 10);

        Hashtable<String, Integer> hashTable = new Hashtable<>();
        addToHashtable(hashTable, "silver", 8);
        addToHashtable(hashTable, "ruby", 4);
        addToHashtable(hashTable, "gold", 12);
        addToHashtable(hashTable, "emerald", 6);

        Map<String, Integer> result = mergeMaps(hashMap, hashTable);
        result.forEach((key, value) ->
                System.out.println("Key: " + key + " | Value: " + value));
    }
}