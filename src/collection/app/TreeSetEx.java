package collection.app;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx {
    //TreeSet에 무작위로 점수를 입력하고 검색하는 방법
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();

        //Integer 점수 저장
        scores.add(75);
        scores.add(80);
        scores.add(87);
        scores.add(70);
        scores.add(65);
        scores.add(50);
        scores.add(90);
        scores.add(95);

        //점수를 foreach문을 이용하여 점수들을 출력
        for ( Integer i: scores
             ) {
            System.out.println(i+" ");
        }

        //특정 점수를 가져오기

        //가장 낮은 점수 출력
        System.out.println("가장 낮은 점수 출력");
        System.out.println(scores.first());
        //가장 높은 점수 출력
        System.out.println("가장 높은 점수 출력");
        System.out.println(scores.last());
        //90점 아래 점수
        System.out.println("90점 아래 점수");
        System.out.println(scores.lower(90));
        //90점 위 점수
        System.out.println("90점 위 점수");
        System.out.println(scores.higher(90));
        //90점이거나 바로 아래 점수
        System.out.println("90점이거나 바로 아래 점수");
        System.out.println(scores.floor(90));
        //80점 이거나 바로 위의 점수
        System.out.println("80점 이거나 바로 위의 점수");
        System.out.println(scores.ceiling(80)+"\n");

        //내림차순 정렬하기
        //NavigableSet으로 내림차순된 값을 리턴
        //TreeSet에 저장된 scores를 descendingSet()메소드를 사용하여 내림차순한다.
        //그 값들을 NavigableSet(인터페이스)에 정수형 타입의 descendingScores에 저장한다.
        NavigableSet<Integer> descendingScores = scores.descendingSet();
        for (Integer s : descendingScores){
            System.out.print(s + " ");
        }
        System.out.println("\n야호");
        //
        System.out.println(scores.descendingIterator());

        //true => 포함한다
        //범위 검색 (80<=)
        NavigableSet<Integer> rangeSet = scores.tailSet(80,true);
        for (Integer s : rangeSet){
            System.out.println(s + " ");
        } System.out.println("\n");

        //false => 포함하지 않는다.
        //범위 검색 (80<= scores < 90)
        rangeSet = scores.subSet(80,true,90,false);
        for (Integer s : rangeSet){
            System.out.println(s + " ");
        } System.out.println("\n");
    }

}
