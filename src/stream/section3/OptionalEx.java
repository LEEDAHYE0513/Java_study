package stream.section3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class OptionalEx {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //double avg = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
        //실행하면 npe가 뜬다. add를 안해서 비어있기 때문이다.
        //위의 코드보다 밑의 코드를 사용하는 이유는 null포인터 익셉션을 에방하기 위하여 Optional을 사용한다.
        OptionalDouble optionalDouble = list.stream()
                .mapToInt(Integer::intValue).average();

        //Optional 방법1 (15,16줄은 여기서만 쓰임!)
        if (optionalDouble.isPresent()){
            System.out.println("평균: "+optionalDouble.getAsDouble());
        }else {
            System.out.println("평균: "+ 0.0);
        }

        //Optional 방법2
        double avg = list.stream()
                .mapToInt(Integer::intValue).average().orElse(0.0);
        //15줄의 OptinalDouble을 안쓰고 일반 double을 사용하고 싶을 경우 위의 코드를 사용한다.
        //average() 함수는 무조건 double리턴 형식

        System.out.println("방법2 avg: "+ avg);

        //Optional 방법3
        list.stream().mapToInt(Integer::intValue).average()
                .ifPresent(average -> System.out.println("방법3 avg: " + average));

        //ifPresent 값이 존재하냐 -> 없으면 아무일도 안 일어나게 하는 함수이다.
    }
}
