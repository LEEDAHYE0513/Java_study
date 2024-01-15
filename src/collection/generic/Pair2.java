package collection.generic;

import collection.app.Dot;

import java.util.List;

public class Pair2<T> {
    private T first;
    private T second;

    public Pair2(T first, T second) {
        this.first = first;
        this.second = second;
    }
    public void swqp(){
        T temp = first;
        first = second;
        second = temp;
    }



    public T getFirst() {
        return first;
    }
    public T getSecond() {
        return second;
    }

    public static void main(String[] args) {
        Pair2<Integer> intPair = new Pair2(1,2);
        System.out.println(intPair.getFirst() + ","+ intPair.getSecond());
        intPair.swqp();
        System.out.println(intPair.getFirst()+","+intPair.getSecond());
    }



}
