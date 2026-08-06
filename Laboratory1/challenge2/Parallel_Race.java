package challenge2;

import java.util.List;
import java.util.function.Function;

public class Parallel_Race {

    // Lane two: finds the min value in a list
    Function<List<Integer>, Integer> findMin = (list) -> list.stream().mapToInt(Integer::intValue).min().orElseThrow();

    // returns the total number of elements
    Function<List<Integer>, Integer> countElements = (list) -> list.size();

    public String firstCollission(List<Integer> numbers) {
        return "Min: " + findMin.apply(numbers) + ", Count: " + countElements.apply(numbers);
    }

    public String secondCollission(List<Integer> numbers) {
        int min = findMin.apply(numbers);
        return (min % 2 == 0) ? "value divisible by 2" : "value not divisible by 2";
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 3, 8, 1, 9, 2, 7, 4, 6);
        System.out.println("Numbers: " + numbers);

        Parallel_Race race = new Parallel_Race();
        System.out.println("Min value :" + race.findMin.apply(numbers));
        System.out.println("Total elements: " + race.countElements.apply(numbers));

    }
}