package lamda;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class LamdaEx3 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        numbers.forEach(number -> System.out.println(number));

        //reduce 람다식 사용해서 누적곱
        int result = numbers.stream().reduce(1, (a,b)->a*b);
        System.out.println(result);

        //이름 리스트 알파벳순서
        List<String > names = Arrays.asList("dahye","dkdk","slsl","ejw");
        List<String> namelist = names.stream().sorted().collect(Collectors.toList());
        //stream은 1회성이기에 담아줄 리스트가  필요하다. !!
        System.out.println(namelist);

        List<String> uppercase = names.stream().map(name -> name.toUpperCase()).toList();
        System.out.println(uppercase);
    }
}



















//
//public class LamdaEx3 {
//
//    //문자열 길이 반환
//    @FunctionalInterface
//    interface StringOperation {
//        int getLength(String string);
//    }
//
//    //정수 배열을 받아 모든 홀수의 합 반환
//    @FunctionalInterface
//    interface ArrayOperation {
//        int calculateSum(int[] numbers);
//    }
//
//    //정수 리스트를 받아 최대값을 반환하는 람다식을 작성
//    interface FindMax {
//        int getMax(List<Integer> numbers);
//    }
//
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        //1. 문자열 길이를 반환하는 람다식 작성
//        StringOperation addition = (string) -> string.length();
//        //2. 람다식에 데이터를 전달한 후 반환 처리 구문 작성
//        int result = addition.getLength("Hello World!");
//        //3. 출력
//        System.out.println("Result : " + result);
//        System.out.println("================================");
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        ArrayOperation sumOfOdd = (numbers) -> Arrays.stream(array)
//                .filter(number -> number % 2 != 0)
//                .sum();
//        int result2 = sumOfOdd.calculateSum(array);
//        System.out.println("홀수 합 : " + result2);
//
//
//        FindMax max = (numbers) -> {
//            int maxNumber = Integer.MIN_VALUE;
//            for (int number : numbers) {
//                if (number > maxNumber) {
//                    maxNumber = number;
//                }
//            }return maxNumber;
//        };
//
//        List<Integer> numberList = new ArrayList<>();
//        for(int i = 0; i < 5; i++){
//            System.out.println("숫자 입력:");
//            int n = input.nextInt();
//            numberList.add(n);
//        }
//        //함수형인터페이스인 findmax를 생성하여 단일추상메소드 SAM인 getmax를호출하여 최댓값을 구하여 maxvalue에 저장하여 출력함.
//        int maxValue = max.getMax(numberList);
//        System.out.println("Maz value : "+maxValue);
//
//    }
//}
//
