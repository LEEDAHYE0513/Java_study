//package lamda.dhex;
//
//import lambdaQuiz.MathOperation_;
//import lambdaQuiz.StringOperation_;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//
//public class ex {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//        // 1번
//        System.out.println("-1번-");
//        int result1 = integers.stream().filter(n -> n % 2 == 0).reduce(1, (a, b) -> a + b);
//        System.out.println(result1);
//
//        // 2번
//        System.out.println("-2번-");
//        MathOperation_ addition = Integer::sum;
//        int result2 = addition.calculate(5, 3);
//        System.out.println(result2);
//
//        // 3번 문자열을 받아 그 길이를 반환하는 람다표현식작성
//      //  Sting str1
//    }
//}
