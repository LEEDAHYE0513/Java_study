package stream.section1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        //배열을 스트림 객체로 만드는 방법 투!
        int[] array = {1,2,3,4,5};
        Stream<Integer> stm1 = Arrays.stream(array).boxed();
        //IntStream stm1 = Arrays.stream(array);


        //중간연산자 이용해서 홀수를 추출해서 stm2 만들어 저장
        Stream<Integer> stm2 = stm1.filter(number -> number%2==1);
        // System.out.println(stm2);    -> java.util.stream.ReferencePipeline$2@3d075dc0 주소값이 출력된다.
        // stream 객체의 값을 출력하고 싶을 땐 forEach 사용해야 한다.
        stm2.forEach(System.out::println);

        //stm2 총합
        int sum = stm2.mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}






















/*

        //1. 정수형 배열 arrray 생성하고 1,2,3,4,5로 초기화 하세요
        int[] array ={1,2,3,4,5};

        //2. array배열에 스트림 객체 stm1을 생성하세요
        IntStream stm1 = Arrays.stream(array);

        Stream<Integer> stm11 = Arrays.stream(array).boxed();

        //3. 중간연산 스트림 객체 stm1에 대해 홀수만 추출하여 스트림 객체 stm2에 저장하세요
        IntStream stm2 = stm1.filter(n->n%2==1);

        Stream<Integer> stm22 = stm11.filter(n->n%2==1);

        //4. stm2 스트림 객체의 총합을 구하세요.
        int sum = stm2.sum();
        int total = stm22.collect(Collectors.summingInt(Integer::intValue));
        //int total = stm22.mapToInt(Integer::intValue).sum();

        //5. 최종 결과 출력하세요.
        System.out.println(sum);
    }
}
*/
