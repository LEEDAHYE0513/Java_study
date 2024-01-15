package stream.section1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx5 {
    public static void main(String[] args) {
        int sum = IntStream.of(1,2,3,4,5).sum();

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,33,22,20,7,8);
       // int total2 = IntStream.of(numbers).sum();
        //왜 안될까요?   -> of()의 ()에는 int,array만 가능하다.

        int total2 = IntStream.of(numbers.stream().mapToInt(Integer::intValue).toArray()).sum();

        //스트림 형 변환에 대해 알아보자!!
        //객체 스트림
        Stream<Integer> stream = numbers.stream();
        //원시 스트림
        IntStream stream1 = numbers.stream().mapToInt(Integer::intValue);


    }
}










        /*
        List<String> list = Arrays.asList("apple","pear","orange","banana","tomato");
        //list의 문자열을 대문자로 변환하여 출력하세요.
        list.stream().map(String::toUpperCase).forEach(System.out::println);

        //list문자열을 소문자로 변환하여 출력하세요.
        list.stream().map(String::toLowerCase).forEach(System.out::println);
        list.stream().forEach(System.out::println);

        //1. of메소드를 이용하여 직접 입력해 입력스트림을 만들 수 있습니다. 합계 구하기
        int total1 = IntStream.of(1,3,5,7,9).sum();
        System.out.println(total1);

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,33,22,20,7,8);
        //int total2 = IntStream.of(numbers).sum();

        //방법1
        int total2 = numbers.stream().mapToInt(Integer::intValue).sum();
        //방법2
        int total3 = IntStream.of(numbers.stream().mapToInt(Integer::intValue).toArray()).sum();

        //2. 스트림 데이터 개수를 세는 최종 연산을 합니다. count()
        long count = IntStream.of(3,5,6,7,8,9,0,10).count();
        System.out.println(count);

        //3. 스트림 데이터 평균을 구하는 최종연산을 합니다.
        IntStream.of(90,88,70,80,55,86).average().ifPresent(avg -> System.out.println("average : "+ avg));

        //4. 스트림 데이터의 최솟값을 구하는 최종연산을 합니다.
        IntStream.of(90,88,70,80,55,86).min().ifPresent(min -> System.out.println("최솟값 : "+ min));

        //5. 스트림 데이터의 최댓값을 구하는 최종연산을 합니다.
        IntStream.of(3,5,7,9,10,1).max().ifPresent(max -> System.out.println("최댓값 : "+ max));

    }
    public static IntStream of(int...values){
        return Arrays.stream(values);
    }
}
*/