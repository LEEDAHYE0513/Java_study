package collection.app;

import java.util.*;

//public class TreeMapEx {
//    //TreeSet에 무작위로 점수를 입력하고 검색하는 방법
//    public static void main(String[] args) {
//        TreeMap<String, Integer> scores = new TreeMap<>();
//
//        //이름(String, 점수 Integer) 저장
//        scores.put("sam",75);
//        scores.put("Tom",80);
//        scores.put("sara",87);
//        scores.put("sin",70);
//        scores.put("adward",65);
//        scores.put("kim",50);
//        scores.put("kate",90);
//        scores.put("billy",95);
//
//        //foreach 문을 이용하여 오름차순 정렬된 scores의 학생의 이름과 점수들을 출력
//        Set<Map.Entry<String, Integer>> entrySet = scores.entrySet();
//        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
//
//        TreeSet<Integer> score = new TreeSet<>();
//
//
//        while (entryIterator.hasNext()) {
//            Map.Entry<String,Integer> entry = entryIterator.next();
//            String k = entry.getKey();
//            Integer v = entry.getValue();
//            score.add(v);;
//            System.out.println(k + " : " + v);
//
//        }
//
//
//
//        //특정 점수를 가져오기
//        //가장낮은 점수 출력
//        System.out.println("가장낮은 점수 출력" + score.first());
//        //가장 높은 점수 출력
//        System.out.println("가장낮은 점수 출력" + score.last());
//        //90점 아래 점수
//        System.out.println("90점 아래 점수");
//        System.out.println(score.lower(90));
//        //90점 위 점수
//        System.out.println("90점 위 점수");
//        System.out.println(score.higher(90));
//        //90점이거나 바로 아래 점수
//        System.out.println("90점이거나 바로 아래 점수");
//        System.out.println(score.floor(90));
//        //80점 이거나 바로 위의 점수
//        System.out.println("80점 이거나 바로 위의 점수");
//        System.out.println(score.ceiling(80)+"\n");
//
//        //범위 검색(key : 이름이 b~k 학생의이름 과 점수 출력하라 )
//        NavigableSet<String> rangeSet = score.subSet(b,true,k,false);
//        for (String st : rangeSet){
//            System.out.println(st + " ");
//        } System.out.println("\n");
//
//
//        //범위 검색( 점수:80<= scores < 90 의 학생의 이름과 점수를 출력하라 )
//        NavigableSet<Integer>rangeSett = score.subSet(80,true,90,false);
//        for (Integer s : rangeSett){
//            System.out.println(s + " ");
//        } System.out.println("\n");
//
//    }
//
//}
