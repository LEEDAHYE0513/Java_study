package collection.generic;

public class MycClass2 {
    public static <T> void swap( T[] array, int index1, int index2){
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        System.out.println("====Before swap======");
        for (Integer number : intArray){
            System.out.println(number + " ");
        }
        System.out.println();
        swap(intArray, 1,3);

        System.out.println("====Before swap======");
        for (Integer number : intArray){
            System.out.println(number + " ");
        }
    }
}
