package challenge2;

public class Results {
    int max;
    int min;
    int count;
    String divisibleByTwo;
    String sizeParity;

    public Results(int max, int min, int count, String divisibleByTwo, String sizeParity) {
        this.max = max;
        this.min = min;
        this.count = count;
        this.divisibleByTwo = divisibleByTwo;
        this.sizeParity = sizeParity;
    }

    @Override
    public String toString() {
        return "Results{" +
                "max=" + max +
                ", min=" + min +
                ", count=" + count +
                ", divisibleByTwo='" + divisibleByTwo + '\'' +
                ", sizeParity='" + sizeParity + '\'' +
                '}';
    }
}