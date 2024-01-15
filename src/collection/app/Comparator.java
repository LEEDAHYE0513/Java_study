package collection.app;

public class Comparator implements Comparable<Comparator> {
    private int first;
    private int second;
    private int third;


    public Comparator(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }


    @Override
    public int compareTo(Comparator o) {
        int result = Integer.compare(first, o.first);
        if (result == 0) {
            result = Integer.compare(second, o.second);
            if (result == 0) {
                result = Integer.compare(third, o.third);

            }
        }
        return result;
    }


    @Override
    public String toString() {
        return "SampleNumber{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }


}
