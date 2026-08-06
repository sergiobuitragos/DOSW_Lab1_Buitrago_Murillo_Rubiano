package challenge4;

import java.util.HashMap;
import java.util.Map;

/**
 * guarda clave-valor en HashMap he ignorando las claves repetidas
 */
public class Challenge4 {

    /**
     * Agrega una clave y un valor al mapa.
     * @param map 
     * @param key 
     * @param value 
     */
    public static void addTreasure(Map<String, Integer> map, String key, Integer value) {

        if (!map.containsKey(key)) {
            map.put(key, value);
        }
    }

    /**
     * clase principal
     * @param args
     */
    public static void main(String[] args) {

        HashMap<String, Integer> treasures = new HashMap<>();

        addTreasure(treasures, "oro", 100);
        addTreasure(treasures, "plata", 50);
        addTreasure(treasures, "oro", 200); // Se ignora

        System.out.println(treasures);
    }
}