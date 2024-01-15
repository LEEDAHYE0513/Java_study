package stream.section1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx4 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("홍길동 제주도 도망","풍자 먹찌빠","강호동 아는형님","유재석 유퀴즈 온더 블록","서장훈 미운오리새끼","신동엽 토요일은 즐겁다");
        //문자열 오름차순
        List<String> list = stringList.stream().sorted().collect(Collectors.toList());
        System.out.println(list);

        //문자열 길이순
        stringList.stream().sorted((a,b) ->Integer.compare(a.length(),b.length())).forEach(System.out::println);

        //Comparable 의 +1, 0, -1 을 적용한 느낌..
        stringList.stream().sorted((a1,a2)->a2.length()-a1.length()).forEach(System.out::println);
        List<String> newStr1 = stringList.stream().sorted(Comparator.comparing(str->str.length())).toList();
        System.out.println(newStr1);

    }
}















       /*

        //1. sorted(): 스트림을 구성하는 데이터를 조건에 따라 정렬하는 연산

        List<String> stringList = Arrays.asList("홍길동 제주도 도망","풍자 먹찌빠","강호동 아는형님","유재석 유퀴즈 온더 블록","서장훈 미운오리새끼","신동엽 토요일은 즐겁다");

        //2. stream객체로 변환하여 사전순으로 정렬해주세요.
        Stream<String> stringStream = stringList.stream();
        stringStream.sorted().forEach(System.out::println);

        //3. 람다식으로 이용하여 글자 길이순으로 정렬해주세요
//        Collections.sort(stringList);
//
//        Collections.sort(stringList,String::compareTo).forEach(System.out::println);
        stringList.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);


        //2. stream객체로 변환하여 사전순으로 정렬해주세요. (강사님 코드)
        stringList.stream().sorted().forEach(n-> System.out.println(n+"\t"));
        stringList.stream().sorted().forEach(System.out::println);

        Stream<String> s1 = stringList.stream();
        s1.sorted().forEach(System.out::println);

        System.out.println(stringList.stream().sorted(Comparator.comparing(str -> str)).collect(Collectors.toList()));

        List<String> collect = stringList.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);

        Collections.sort(stringList);

        //3. 람다식으로 이용하여 글자 길이순으로 정렬해주세요
        stringList.stream().sorted((str1,str2)->str2.length() - str1.length()).forEach(System.out::println);

        //1번
        List<String> newStr1 = stringList.stream().sorted(Comparator.comparing(str->str.length())).toList();
        System.out.println(newStr1);

        //2번
        System.out.println(stringList.stream().sorted(Comparator.comparing(str->str.length())).toList());
    }
}
*/