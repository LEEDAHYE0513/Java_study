package stream.section3;

//1. 학생별 국어점수 학생별 영어점수 학생별 수학점수 오름차순 정렬, 내림정렬
//2. 총점 평균 ... 평균을 기준으로 오름차순 정렬

import stream.section3.student.Student2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingComparableEx {
    public static void main(String[] args) {
        List<Student2> studentList = new ArrayList<>();
        studentList.add(new Student2("김나나",90));
        studentList.add(new Student2("신지수",89));

        //점수를 기준으로 오름차순 정렬한 새 스트림 얻어오기
        studentList.stream().sorted().forEach(student -> System.out.println(student.getName()+ ":"+student.getscore()));

        //점수를 기준으로 내림차순 정렬한 새 스트림 얻어오기
        studentList.stream().sorted(Comparator.reverseOrder()).forEach(student -> System.out.println(student.getName()+ ":"+student.getscore()));

        //만약 Comparable 인터페이스가 구현되지 않은 구현체를 정렬하려면 Comparator를 이용한다.
        List<Student2> studentList3 = new ArrayList<>();
        studentList3.add(new Student2("김이이",90));
        studentList3.add(new Student2("신지아",89));

        //점수를 기준으로 오름차순으로 정렬한 새 스트림 생성
        studentList3.stream().sorted((s1,s2)->Integer.compare(s1.getscore(), s2.getscore()))
                .forEach(student2 -> System.out.println(student2.getName()+":"+student2.getscore()));

        //점수를 기준으로 내림차순으로 정렬한 새 스트림 얻기
        studentList3.stream().sorted((s1,s2)->Integer.compare(s2.getscore(), s1.getscore()))
                .forEach(student2 -> System.out.println(student2.getName()+":"+student2.getscore()));

    }
}
