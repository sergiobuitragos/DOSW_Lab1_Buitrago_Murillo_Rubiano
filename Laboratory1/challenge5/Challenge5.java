package challenge5;

import java.util.HashSet;
import java.util.Set;

/**
 * Almacena numeros enteros en un HashSet y elimina los multiplos de 3
 */
public class Challenge5 {

    /**
     * borra multiplos de 3.
     *
     * @param numbers
     */
    public static void removeMultiplesOfThree(Set<Integer> numbers) {
        numbers.removeIf(number -> number % 3 == 0);
    }

    /**
     * Clase principal
     * @param args
     */
    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(6);
        numbers.add(8);
        numbers.add(9);
        numbers.add(12);

        removeMultiplesOfThree(numbers);

        System.out.println("Conjunto final: " + numbers);
    }
}