package collection.generic;

public class MycClass3 {
    public static <T> int countOccurrences(T[] array, T element){
        int count = 0;
        for (T item : array){
            if(item.equals(element)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String[] strArray = {"apple","banana","apple","orange","apple"};
        String target = "apple";
        int occurrences = countOccurrences(strArray, target);
        System.out.println(target + " : " + occurrences);
    }
}
