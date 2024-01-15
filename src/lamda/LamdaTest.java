package lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LamdaTest {
    public static void main(String[] args) {
        //1. 제시되는 list를 오름차순으로 정렬하는 람다식을 작성하세요
        List<String> list = Arrays.asList("apple","banana","pear","orange");
        list.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);

        //2. 문자열을 대문자로 변환하는 람다 표현식 작성
        list.stream().map(string -> string.toUpperCase()).forEach(System.out::println);

        //3. 문자열이 비어 있는지 확인하는 람다 표현식 작성
        Predicate<String> isEmpty = s-> s.isEmpty();
        boolean result = isEmpty.test(list.stream().toString());
        System.out.println(result);

        //isEmpty()는 String 클래스에서 사용할 수 있는 메서드로, 해당 문자열(string)이 비어 있는지 여부를 확인합니다.
        //그렇기에 Predicate<Integer> 요런 경우엔 사용할 수 없지 string이 아니니까ㅋㅋ
        //Predicate 인터페이스는 <T> 타입을 받아 boolean test(T t) 메소드를 실행해야 해
        //이 코드에서 String 타입으로 받았기에 test 메소드의 매개변수도 String타입을 받아야해.
        //그렇기 때문에 test() 괄호 안에 String을 넣으려고 toString()을 써준거야

        //4. 두 문자열을 연결하는 람다 표현식을 작성
        BiFunction<String, String, String> biFunction = (str1,str2) -> str1.concat(str2);
        String hi = biFunction.apply("안녕","하세요.");
        System.out.println(hi);

        //5. 숫자의 제곱을 계산하는 람다 식 작성
        Function<Integer, Integer> number = (a-> a*a);
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        numbers.stream().mapToInt(Integer::intValue).toArray();
        int n =number.apply(5);
        System.out.println(n);
    }
}

    //1. 제시되는 list를 오름차순으로 정렬하는 람다식을 작성하세요
//    List<String> list = Arrays.asList("apple","banana","pear","orange");
//        list.sort((s1,s2)->s1.compareTo(s2));
//                System.out.println(list);
//
//                //2. 문자열을 대문자로 변환하는 람다 표현식 작성
//                Function<String, String> toUpperCase = (str)->str.toUpperCase();
//        System.out.println(toUpperCase.apply("hello"));
//        Function<String, String> toLowerCase = (str)->str.toLowerCase();
//        System.out.println(toLowerCase.apply("Hellod"));
//
//        //3. 문자열이 비어 있는지 확인하는 람다 표현식 작성
//        Predicate<String> isEmpty = String::isEmpty;
//        System.out.println(isEmpty.test(""));
//
//        //4. 두 문자열을 연결하는 람다 표현식을 작성
//        BiFunction<String, String, String> concatename = String::concat;
//        System.out.println(concatename.apply("자바신세계","개발자 과정"));
//
//        //5. 숫자의 제곱을 계산하는 람다 식 작성
//        Function<Integer,Integer> square = (number)-> number*number;
//        System.out.println(square.apply(5));