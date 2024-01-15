package lamda;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class LamdaEx1 {

    public static void main(String[] args) {
        //java에서 제공하는 List 인터페이스는 객체를 요소로 갖기에 기본 데이터 타입인 int를 사용할 수 없고
        // 기본 데이터타입을 감싸는 Wrapper클래스 Integer를 사용해야 한다.
        List<Integer> numbers = asList(1,2,4,3,5,6,7,8,9,10);

        int sumOfEvenNumbers = numbers.stream() //스트림으로 변환하는 이유가 코드 가독성 높이고 내부적으로 반복할 수 있게 하기 위해
                .filter(number->number % 2 ==0) //filter은 조건문이다.
                .mapToInt(Integer::intValue) //자료형 변수 int요구하기에 형변환을 해서 sum을 쓸 수 있게 바꾸어줌
                .sum();

        System.out.println("sumOfEvenNumbers" + sumOfEvenNumbers);

    }
}
