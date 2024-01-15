package stream.section3;

import java.util.*;

public class ArrayStreamEx {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        //1. 카운팅
        long total = Arrays.stream(array).count();
        //2. 총합
        int sum = Arrays.stream(array).sum();
        //3. 평균
        Double avg = Arrays.stream(array).average().getAsDouble();
        //4. 최댓값
        Integer max = Arrays.stream(array).max().getAsInt();
        //5. 최소값
        Integer min = Arrays.stream(array).min().getAsInt();
        //6. 첫요소 출력
        Integer findFirst = Arrays.stream(array).findFirst().getAsInt();

        System.out.println("카운팅: " +total);
        System.out.println("총합: "+sum);
        System.out.println("평균:" +avg);
        System.out.println("최댓값:" +max);
        System.out.println("최소값:" +min);
        System.out.println("첫요소 출력:" +findFirst);
    }
}
