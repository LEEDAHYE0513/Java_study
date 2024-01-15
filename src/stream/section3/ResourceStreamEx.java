package stream.section3;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//### 배열로부터 스트림 얻기 : Java.util.Arrays 클래스를 이용하면 다양한 종류의 배열로부터 스트림을 얻어내 수 있다.
public class ResourceStreamEx {
    public static int total;
    public static int total2;


    public static void main(String[] args) throws Exception {
        // 1. String 스트림 객체 얻기
        Stream<String> stringStream = Arrays.asList("초코파이", "몽쉘", "오예스").stream();
        stringStream.forEach(System.out::println);

        // 2. Integer 스트림 객체
        int[] scores = {90,80,77,80,65,98};

        // 3.Integer 스트림 객체를 얻어, scores의 각 요소값의 총합, 평균, 해당 요소의 개수를 각각 츨력하세요.
        Stream<Integer> integerStream = Arrays.stream(scores).boxed();
        int total = integerStream.mapToInt(Integer::intValue).sum();
        double avg = integerStream.mapToInt(Integer::intValue).average().getAsDouble();
        long count = integerStream.mapToInt(Integer::intValue).count();
        int counnt = Arrays.stream(scores).toArray().length;
        int countt = integerStream.toArray().length;
        System.out.println(countt);
    }
}
//
//
//    //1. String 스트림 객체 얻기
//    String[] strings = {"초코파이", "촉칙", "ABC"};
////strings 스트림 객체를 얻어, string의 각 요소값을 출력하세요.
//        Arrays.stream(strings).forEach(System.out::println);
//
//                //2. Integer 스트림 객체 얻기
//                int[] scores = {90, 80, 77, 80, 65, 98};
//
//                //Integer 스트림 객체를 얻어, scores의 각 요소값의 총합, 평균, 해당 요소의 개수를 각각 츨력하세요.
//                System.out.println("총합: " + Arrays.stream(scores).sum());
//                System.out.println("평균: " + Arrays.stream(scores).average().orElse(0.0));
//                System.out.println("개수: " + Arrays.stream(scores).count());
//
//                //3. 특정 범위의 숫자 스트림 얻기 (IntStream 또는 LongStream의 정적 메소드 range(), rangeClosed())
//                IntStream stream1 = IntStream.range(1, 101);
//                IntStream stream2 = IntStream.rangeClosed(1, 100);
//
//
//                stream1.forEach(number -> total += number);
//                System.out.println("총합 :" + total);
//
//                stream2.forEach(number -> total2 += number);
//                System.out.println("총합 :" + total2);
//
//                int row = 3;
//                int column = 5;
//                StringBuffer sb = new StringBuffer();
//                IntStream.range(0, column).forEach(s1 -> sb.append('*'));
//                IntStream.range(0, row).forEach(s2 -> sb.append('*'));
//
//
//                //4. 파일로부터 스트림 어기
//                // java.nio.file.Fils의 lines() 이용하면, 텍스트 파일의 행단위 스트림을 얻을 수 있다.
//                Path path = Paths.get(ResourceStreamEx.class.getResource("productlist.txt").toURI());
//        Stream<String> filestream = Files.lines(path, Charset.defaultCharset());
//        filestream.forEach(line -> System.out.println(line));
//        filestream.close();