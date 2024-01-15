package collection.generic;

public class Myclass {
    public static <T> void printArray(T[] array){
        for (T element : array)
            System.out.println(element);
    }
}