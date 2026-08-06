package challenge2;

public class Results {

    private int maxValue;
    private int minValue;
    private int count;
    private boolean multipleOfTwo;
    private String sizeType;

    public Results(int maxValue, int minValue, int count,
                   boolean multipleOfTwo, String sizeType) {
        this.maxValue = maxValue;
        this.minValue = minValue;
        this.count = count;
        this.multipleOfTwo = multipleOfTwo;
        this.sizeType = sizeType;
    }

    @Override
    public String toString() {
        return "Results{" +
                "maxValue=" + maxValue +
                ", minValue=" + minValue +
                ", count=" + count +
                ", multipleOfTwo=" + multipleOfTwo +
                ", sizeType='" + sizeType + '\'' +
                '}';
    }
}
