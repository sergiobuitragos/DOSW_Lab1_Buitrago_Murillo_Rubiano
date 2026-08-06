package challenge5;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Challenge5 {

    // Remove numbers that can be divided by 3
    public static void removeMultiplesOfThree(Set<Integer> numbers) {
        // Keep only the numbers that are NOT multiples of 3
        Set<Integer> filtered = numbers.stream()
                .filter(number -> number % 3 != 0)
                .collect(Collectors.toSet());
        
        // Update the original set with the new numbers
        numbers.clear();
        numbers.addAll(filtered);
    }

    // Remove numbers that can be divided by 5
    public static void removeMultiplesOfFive(Set<Integer> numbers) {
        // Keep only the numbers that are NOT multiples of 5
        Set<Integer> filtered = numbers.stream()
                .filter(number -> number % 5 != 0)
                .collect(Collectors.toSet());
        
        // Update the original set with the new numbers
        numbers.clear();
        numbers.addAll(filtered);
    }

    public static void main(String[] args) {

        // Create a HashSet and add numbers
        HashSet<Integer> hashSetA = new HashSet<>();
        hashSetA.add(4);
        hashSetA.add(9);
        hashSetA.add(15);
        hashSetA.add(7);
        hashSetA.add(18);
        hashSetA.add(21);
        hashSetA.add(10);
        hashSetA.add(5);

        // Create a TreeSet and add numbers (it sorts them automatically)
        TreeSet<Integer> treeSetB = new TreeSet<>();
        treeSetB.add(12);
        treeSetB.add(3);
        treeSetB.add(25);
        treeSetB.add(10);
        treeSetB.add(7);
        treeSetB.add(30);
        treeSetB.add(18);
        treeSetB.add(4);

        // Apply the rules to remove numbers
        removeMultiplesOfThree(hashSetA);
        removeMultiplesOfFive(treeSetB);

        // Final Goal: Combine both sets into one sorted set without duplicates
        TreeSet<Integer> finalArena = new TreeSet<>();
        finalArena.addAll(hashSetA);
        finalArena.addAll(treeSetB);

 
        finalArena.forEach(number -> System.out.println("Number in the arena: " + number));
    }
}