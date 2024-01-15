package stream.section3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringEx1 {
    public static void main(String[] args) {
        //1. List<String>컬렉션 ArrayList namelist 생성하세요
        List<String> namelist = new ArrayList<>();
        //2. namelist에 이름을 추가해주세요. 같은 이름을 두버 넎어주세요
        namelist.add("다혜");
        namelist.add("다혜");
        namelist.add("혜다");
        namelist.add("정수");
        namelist.add("정호");

        //3. 중복요소 제거
        namelist.stream().forEach(System.out::println);
        System.out.println("________________");
        namelist.stream().distinct().forEach(System.out::println);

        //4. "정"으로 시작하는 요소만 필터링
        List<String> jungganae = namelist.stream().filter(name ->name.startsWith("정")).collect(Collectors.toList());
        System.out.println(jungganae);

        //5. 중복요소를 제거하고, "정으로 시작하는 요소만 필터링하여 lastnamelist로 저장하세요.
        List<String> lastnamelist = namelist.stream().distinct().filter(name -> name.startsWith("정")).collect(Collectors.toList());

        //6. lastnamelist를 출력하세요.
        lastnamelist.stream().forEach(System.out::println);
    }
}
