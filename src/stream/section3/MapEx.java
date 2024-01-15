package stream.section3;

import java.util.Arrays;
import java.util.stream.IntStream;

//정수 스트림을 실수 스트림으로 변환, 기본 타입 스트림을 래퍼 스트림으로 변환
public class MapEx {

    public static void main(String[] args) {

        int[] intArray ={1,2,3,4,5};

        // intArray를 IntStream으로 ...
        IntStream intStream = Arrays.stream(intArray);
        System.out.println(intStream);

        //3. intStream을 DoubleStream으로 ...
//      intStream.asDoubleStream().forEach(d -> System.out.println(d));    밑에걸루 변경 가능
        intStream.asDoubleStream().forEach(System.out::println);

        System.out.println();

        intStream = Arrays.stream(intArray);
        intStream.boxed().forEach(obj -> System.out.println(obj.intValue()));
        //4.
    }
}
