package stream.section1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx3 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        List<Integer> list = new ArrayList<>();

        //방법 1
        Stream<Integer> stream1 = Arrays.stream(array).boxed();
        //방법2
        IntStream stream2 = IntStream.of(array);
        //방법3
        IntStream stream3 = Arrays.stream(array);

        stream1.filter(n->n%2!=0).forEach(n->list.add(n));
        System.out.println(list);

        stream2.filter(n->n%2!=0).forEach(n->list.add(n));
        System.out.println(list);

        stream3.filter(n->n%2!=0).forEach(n->list.add(n));
        System.out.println(list);
    }
}


























        /*
        int[] array = {1,5,3,2,4};
        List<Integer> list = new ArrayList<>();
        // 1. 컬렉션 이용한 방식
        //1-1.  foreach를 이용해서 array의 숫자를 list에 추가하되 홀수만 추가해주세요.
        for (int i :array) {
            if (i%2==1){
                list.add(1);
            }
        }
        //1-2. list를 오름차순으로 정렬
        Collections.sort(list);

        //1-3. foreach를 이용하여 list 요소 출력
        for (int i : array){
            System.out.println(i + "\t");
        }

        //2. stream 이용한 방식
        Arrays.stream(array).filter(n->n%2==1).sorted().forEach(n-> System.out.println(n+"\t"));
    }
}
*/