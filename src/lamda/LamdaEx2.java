package lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@FunctionalInterface
interface MathOperation {
    int calculate(int a, int b);
}

interface ArrayOperation {
    int caculateSum(int[] numbers); //정수 배열을 받아 모든 홀수의 합을 반환하는 람다식, 결과
}

interface StringOperation {
    int getlength(String string);
}

interface FindMax{
    int getMax(List<Integer> numbers);
}

public class LamdaEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MathOperation addition = (a, b) -> a + b; //MathOperation 인터페이스를 구현한 객체 addition에 람다식-> 인자를 받아서(a,b), 그 인자들로 이걸(a+b)하겠다
        int result = addition.calculate(5, 3); //MathOperation 인터페이스를 구현한 객체인 addition으로 calculate메소드를 호출해서 인자를 넣는다.(a=5, b=3))
        System.out.println("Result" + result);


        System.out.println("길이 확인이 필요한 문자열을 입력해주세요.");
        StringOperation str = (stringg -> stringg.length()); //StingOperation 인터페이스를 구현한 객체 str에 람다식 -> 인자인 stringg을 받아서 그 stringg로 이걸(length)하겠다
        int lengthResult = str.getlength(sc.nextLine()); // StringOperation 인터페이를 구현한 객체인 str로 getlength()메소드를  호출할 수 있다. getength()안에 매개변수 string을 받을 수 있다.
        System.out.println("lengthResul: "+ lengthResult);

        //정수 리스트를 받아 최댓값을 반환하는 람다식을 작성하세요
        FindMax max = (numbers) ->{
            int maxNumber = Integer.MIN_VALUE;
            for (int number : numbers) {
                if (number>maxNumber){
                    maxNumber = number;
                }
            }return maxNumber;
        };
        List<Integer> list = new ArrayList<>();
        System.out.println("숫자 5개를 입력해주세요.");
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        int findmaxresult = max.getMax(list);
        System.out.println(findmaxresult);
    }
}
