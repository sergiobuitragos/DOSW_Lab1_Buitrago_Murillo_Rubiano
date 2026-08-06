package challenge2;

import java.util.List;
import java.util.function.Function;

public class Parallel_Race{

    //Lane two: finds the min value in a list
    Function<List<Integer>, Integer> findMin = (list) -> list.stream().mapToInt(Integer::intValue).min().orElseThrow();

    //returns the total number of elements
    Function<List<Integer>, Integer> countElements = (list) -> list.size();
    public static void main(String[] args){
        List<Integer> numbers = List.of(5, 3, 8, 1, 9, 2, 7, 4, 6);
        System.out.println("Numbers: " + numbers);

        Parallel_Race race = new Parallel_Race();
        System.out.println("Min value :" + race.findMin.apply(numbers));
        System.out.println("Total elements: " + race.countElements.apply(numbers));
    }
}