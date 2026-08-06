package challenge4;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * guarda clave-valor en HashMap e ignorando las claves repetidas
 */
public class Challenge4 {

    /**
     * A - Agrega una clave y un valor al HashMap.
     */
    public static void addTreasure(Map<String, Integer> map, String key, Integer value) {
        if (!map.containsKey(key)) {
            map.put(key, value);
        }
    }

    /**
     * B - Agrega una clave y un valor al Hashtable.
     */
    public static void addToHashtable(Hashtable<String, Integer> table, String key, Integer value) {
        if (!table.containsKey(key)) {
            table.put(key, value);
        }
    }

    public static void main(String[] args) {
        //HashMap
        HashMap<String, Integer> treasures = new HashMap<>();
        addTreasure(treasures, "gold", 5);
        addTreasure(treasures, "silver", 3);
        addTreasure(treasures, "gold", 7);    // ignored
        addTreasure(treasures, "diamond", 10);
        System.out.println("HashMap: " + treasures);

        //Hashtable
        Hashtable<String, Integer> hashTable = new Hashtable<>();
        addToHashtable(hashTable, "silver", 8);
        addToHashtable(hashTable, "ruby", 4);
        addToHashtable(hashTable, "gold", 12);
        addToHashtable(hashTable, "emerald", 6);
        System.out.println("Hashtable: " + hashTable);
    }
}