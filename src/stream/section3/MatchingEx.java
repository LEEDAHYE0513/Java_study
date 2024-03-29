package stream.section3;

import java.util.Arrays;

public class MatchingEx {
    public static void main(String[] args) {

        int[] intArray = {2,4,6};

        boolean result1 = Arrays.stream(intArray).allMatch(number -> number%2==0);  // 모두 2의 배수인가?
        boolean result2 = Arrays.stream(intArray).anyMatch(number -> number%2==0);  // 하나라도 2의 배수가 있는가?
        boolean result3 = Arrays.stream(intArray).noneMatch(number -> number%2==0); //2의 배수가 없는가? -> 있다. 그러므로 false
        boolean result4 = Arrays.stream(intArray).noneMatch(number -> number%7==0); //7의 배수가 없는가? -> 없다. 그러므로 true

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}
