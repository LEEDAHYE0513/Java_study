package lamda.dhex;

//정수 리스트가 주어졌을 때 Java Lambda를 사용하여 리스트에 있는 모든 짝수의 합을 계산하세요.

import java.util.Arrays;
import java.util.List;

public class Lamda1 {
    public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1,2,3,4,5);

    int evensum = numbers.stream()
            .filter(number -> number %2 ==0)
            .mapToInt(Integer::intValue)
            .sum();
        System.out.println(evensum);


    }

}
