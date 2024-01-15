//package lamda;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
////Java에서 함수형 인터페이스를 선언할 때 사용되는 애노테이션(선택이다!!)
//@FunctionalInterface
//interface Product{
//    int calculate(List<Integer> numbers);
//}
//
//public class LamdaE4 {
//    public static void main(String[] args) {
//
//
//        // 1. 정수형 리스트를 numbers를 생성하세요. 리스트의 순서는 1,2,3,4,5 입니다.
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        //aslist는 배열에 값을 바로 추가하는 기능이다.
//        // 2. numbers의 값을 foreach를 이용하여 순서대로 출력하는 람다식을 작성하세요.
//        numbers.forEach((number) -> {
//            System.out.println(number);
//        });
//
//        // 3. Stream API reduce() + 람다식 = 누적 곱 곱하기
//
//        lamda.product.Product product = products -> products.stream().reduce(1, (a, b) -> a * b);
//        List<Integer> list = List.of(2, 3, 4);
//        System.out.println(product.calculate(list));  //결과 24
//
//        // 4. 이름 리스트를 알파벳 순서로 정렬하세요
//        List<String> names = Arrays.asList("John", "Jane", "Adam", "Eve");
//        Collections.sort(names, new Comparator<String>() {
//            public int compare(String a, String b) {
//                return a.compareTo(b);
//            }
//        });
//
//       // Collections.sort(names.(a, b) -> a.compareTo(b));
//
//
//        //5. 문자열 리스트 names 를 대문자로 변환하는 람다식을 작성하세요.
//        List<String> upperCaseNames = names.stream()
//                .map(name -> name.toUpperCase())
//                .collect(Collectors.toList());
//        System.out.println(upperCaseNames);
//    }
//}
