package lamda;

import java.util.*;
import java.util.stream.Stream;

public class LamdaEx5 {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("dog", "cat", "yeobin");
        Collections.sort(strings, (a,b)->a.compareTo(b));   //람다 표현식
       // Collections.sort(strings); 로 쓸 수도 있음 왜냐 Collections.sort를 쓰려면 Comparable인터페이스를 implements 하고있어야함.
        // 근데 String은 이미 기본적으로 Comparable을 implements 하고 있어서 compareTo 메소드로 딱히 기준 잡아주지 않아도
        // Collection.sort를 사용할 수 있다. Collections.sort는 오름차순이 기본 기능이다.!!!!!

        Collections.sort(strings, String::compareTo);      //메소드 참조 방식
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(i+1);
        }
        int total1 = integers.stream().filter(number -> number%2==0).mapToInt(Integer::intValue).sum();
        int total2 = integers.stream().filter(number -> number%2==0).mapToInt(i->i.intValue()).sum();
        System.out.println(total1);

        String[] str1 = {"aaa","bbb","ccc"};
        String[] str2 = new String[3];
        str2[0] = "ddd";
        str2[1] = "fff";

        List<String> stringList = Arrays.asList(str1);  //str1 배열을 list에 넣은것임.
        //stringList.stream();  //list가 stream화 된 것임.
        Stream<String> stringStream = stringList.stream(); //Stringlist를 Stream 객체인 stringStream로 생성.....
        stringStream.forEach(System.out::println);
    }
}
























//        List<String> strings = Arrays.asList("dog", "cat", "elephant", "rabbit");
//        //1. 문자열 리스트를 오름차순으로 정렬하려고 합니다.
//
//        //람다식
//        Collections.sort(strings,(s1, s2)->s1.compareTo(s2));
//
//        //메소드 참조식
//        // String 클래스의 compareTo 메소드를 가리키며, 이 메소드는 문자열을 비교하여 정렬
//        // compareTo 메소드는 String 클래스에 속한 메소드이다.
//        Collections.sort(strings,String::compareTo);
//
//
//
//
//        //2. 정수 리스트 스트리밍하기, integers 대상으로 모든 짝수의 합을 구하는 식
//        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//
//        int total1 = integers.stream().filter(n->n%2 ==0).mapToInt(Integer::intValue)
//                .sum();
//
//        int total2 = integers.stream().filter(n->n%2 ==0).mapToInt(Integer::intValue).sum();
//        //(Integer::intValue) 요것이 메소드 참조 방식이다!!
//
//        //int 형식의 Stream은 sum()과 같은 숫자들의 합을 계산하는 메소드를 사용할 수 있게 해줍니다.
//        // 따라서 mapToInt(Integer::intValue)를 사용하여 Integer를 int로 변환하는 것은 숫자들의 합을 계산하기 위한 준비 단계입니다.
//        //만약 mapToInt(Integer::intValue)를 사용하지 않고, 단순히 integers.stream().filter(n -> n % 2 == 0).sum()을 호출하면,
//        //Stream<Integer> 형식으로 남아있게 되며, sum() 메소드를 직접적으로 사용할 수 없습니다. 그래서 mapToInt(Integer::intValue)를 통해
//        // int 형식의 Stream으로 변환하여야만 sum()을 호출할 수 있습니다.
//
//
//        String[] str1 = {"aaa", "bbb","ccc"};
//        //Collection List 컬렉션으로 변경
//        List<String> stringList = Arrays.asList(str1);
//        //StringList를 스트림 객체 생성
//        Stream<String> stringStream1 = stringList.stream();
//        Stream<String> str1Stream = Arrays.stream(str1);
//        //스트림 출력
//        stringStream1.sorted().forEach(System.out::println);
//        str1Stream.sorted().forEach(System.out::println);
//
//        //스트림은 데이터소스로부터 데이터를 읽기만 할 뿐, 변경하지 않는다.
//        //한 번 사용하면 닫혀서 다시 사용할 수 없다.
//        //스트림 작업은 내부 반복으로 처리한다.
//
//
//
//    }
//}
