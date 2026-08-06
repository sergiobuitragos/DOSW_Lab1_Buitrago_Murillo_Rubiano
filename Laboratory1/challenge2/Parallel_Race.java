package challenge2;

import java.util.List;
import java.util.function.Function;

public class Parallel_Race {
    // Lane one: finds the max value in a list
    Function<List<Integer>, Integer> findMax = (list) -> list.stream().mapToInt(Integer::intValue).max().orElseThrow();

    // Lane two: finds the min value in a list
    Function<List<Integer>, Integer> findMin = (list) -> list.stream().mapToInt(Integer::intValue).min().orElseThrow();

    // returns the total number of elements
    Function<List<Integer>, Integer> countElements = (list) -> list.size();

    public static void main(String[] args) {

    Parallel_Race race = new Parallel_Race();

    List<Integer> list1 = List.of(5,3,8,1,9,2,7,4,6);

    List<Integer> list2 = List.of(10,20,30,15,25);

    Results[] results = race.processTwoLists(list1, list2);

    System.out.println(results[0]);
    System.out.println(results[1]);
    
    }

    public String firstCollission(List<Integer> numbers) {
        int max = findMax.apply(numbers);
        int min = findMin.apply(numbers);
        int count = countElements.apply(numbers);
        return "Max: " + max + ", Min: " + min + ", Count: " + count;
    }

    public String secondColision(List<Integer> numbers) {
        int max = findMax.apply(numbers);

        return (max % 2 == 0) ? "Value is multiple of 2" : "Value is not multiple of 2";
    }

    public String thirdCollision(List<Integer> numbers) {
        
        int size = countElements.apply(numbers);
        return (size % 2 == 0) ? "List size is even" : "List size is not even";
    }

    public Results processList(List<Integer> numbers){

    int max = findMax.apply(numbers);
    int min = findMin.apply(numbers);
    int count = countElements.apply(numbers);

    boolean multipleOfTwo = max % 2 == 0;

    String sizeType = count % 2 == 0 ? "EVEN" : "ODD";

    return new Results(max, min, count, multipleOfTwo, sizeType);
    }

    public Results[] processTwoLists(
        List<Integer> list1,
        List<Integer> list2){

    Results result1 = processList(list1);
    Results result2 = processList(list2);

    return new Results[]{
            result1,
            result2
    };

    }
}