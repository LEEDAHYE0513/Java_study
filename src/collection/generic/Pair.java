package collection.generic;

public class Pair<T,U> {
    private T first;
    private U two;

    public Pair(T first, U two) {
        this.first = first;
        this.two = two;
    }

    public T getFirst() {
        return first;
    }

    public U getTwo() {
        return two;
    }
}
