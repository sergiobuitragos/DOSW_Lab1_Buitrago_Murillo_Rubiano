package challenge2;

import java.util.List;
import java.util.function.Function;
public class Parallel_Race{

    //Lane one: finds the max value in a list
    Function<List<Integer>, Integer> findMax = (list) -> list.stream().mapToInt(Integer::intValue).max().orElseThrow();

    public static void main(String[] args){
        List<Integer> numbers = List.of(5, 3, 8, 1, 9, 2, 7, 4, 6);
        System.out.println("Numbers: " + numbers);

        Parallel_Race race = new Parallel_Race();
        System.out.println("Max value: " + race.findMax.apply(numbers));
    }
}