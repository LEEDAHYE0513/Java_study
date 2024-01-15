package stream.section2.student;

import java.util.Arrays;
import java.util.List;

public class IndexOf {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("사과", "바나나", "배", "포도");

        System.out.println(list.indexOf("배")); //인덱스 번호
        System.out.println(list.get(2)); // 인덱스 값
    }
}
