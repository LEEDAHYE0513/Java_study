package lamda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LamdaEx4 {
    public static void main(String[] args) {
        //1. map()
        //스트림 api 컬렉션에서 다양한 연산을 수행하기 위해 람다 표현식을 허용하는 메서드를 제공한다.
        //스트림의 요소를 다른 유형으로 변환하는데 사용
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<Integer> squaredNumber = numbers.stream().map(n->n*n).collect(Collectors.toList());
        System.out.println(squaredNumber);

        //2. filter()
        //조건에 따라 스트림에서 요소를 선택하는데 사용 (조건을 정의하는 람다 표현식을 인수로 받는다)
        //2-1 numbers 대상으로 홀수 리스트 oddNumber 구성하여 출력
        //2-2 numbers 대상으로 짝수 리스트를 evenNumber 구성하여 출력

        List<Integer> oddNumber1 = numbers.stream().filter(n ->n%2 ==1).toList();
        List<Integer> oddNumber2 = numbers.stream().filter(n ->n%2 ==1).collect(Collectors.toList());
        List<Integer> evenNumber1 = numbers.stream().filter(n ->n%2 ==1).toList();
        List<Integer> evenNumber2 = numbers.stream().filter(n ->n%2 ==0).collect(Collectors.toList());

        //3. 집계함수 : reduce() : 스트림의 요소를 단일 값으로 집계하는 사용 (축소 연산을 정의하는 람다 표현식을 인수로 받는다.
        int total = numbers.stream().reduce(0,(x,y)-> x + y);
        System.out.println("number의 총합 집계: "+ total);

        //4. forEach() : 스트림의 요소를 반복하고, 각 요소에 대한 작업을 수행하는데 사용 (수행 작업을 정의하는 람다 표현식을 인수로 받는다.)
        numbers.stream().forEach(number -> System.out.println(number));
        //  numbers.forEach(number -> System.out.println(number));

        //응용 문제 스트림 API를 사용하여 리스트 numbers의 평균을 구하는 람다식으로 작성하세요

        double average = numbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);   //예외 처리를 3위해 해줌 !
        System.out.println("Average : "+average);



    }

}
