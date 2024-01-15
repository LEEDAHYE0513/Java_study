package stream.section2.student;

import stream.section2.student.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentMapping {
    public static void main(String[] args) {
        //Student요소를 가진 ArrayList를 배열로 만든다 그것의 이름이 list다.
        // 1.
        List<Student> list = new ArrayList<>();

        // 2.
        Scanner sc = new Scanner(System.in);

        int cnt = 2;
        while (cnt != 0) {
            String tempName;
            Integer[] score = new Integer[3];
            System.out.print("이름 ? ");
            tempName = sc.nextLine();
            System.out.println();
            System.out.print("국어 ? ");
            score[0] = Integer.parseInt(sc.nextLine());
            System.out.print("영어 ? ");
            score[1] = Integer.parseInt(sc.nextLine());
            System.out.print("수학 ? ");
            score[2] = Integer.parseInt(sc.nextLine());

            list.add(new Student(tempName, score[0], score[1], score[2]));
            cnt--;
        }

        List<String> nameList = list.stream().map(st -> st.getName()).collect(Collectors.toList());
        System.out.println(nameList);

        List<Integer> korList = list.stream().map(st -> st.getKorScore()).collect(Collectors.toList());
        System.out.println(korList);

        List<Integer> engList = list.stream().map(st -> st.getEngScore()).collect(Collectors.toList());
        System.out.println(korList);

        List<Integer> mathList = list.stream().map(st -> st.getMathScore()).collect(Collectors.toList());
        System.out.println(korList);

        int korSum = korList.stream().mapToInt(Integer::intValue).sum();
        double korAvg = korList.stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println(korSum + " " + korAvg);

        int engSum = engList.stream().mapToInt(Integer::intValue).sum();
        double engAvg = engList.stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println(engSum + " " + engAvg);

        int mathSum = mathList.stream().mapToInt(Integer::intValue).sum();
        double mathAvg = mathList.stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println(mathSum + " " + mathAvg);

        System.out.println("번호 이름 국어 영어 수학 총점 평균");

        //map 함수는 list에 저장된 Student 객체들을 가지고 특정 작업(get name을 이용해서 하나의 string인 totalExam을 만든다)을 수행하게 함.

        List<String> totalExam = list.stream().map(st -> (list.indexOf(st)+1) + "   " + st.getName() + "  " + st.getKorScore() + "  " + st.getEngScore() + "  " + st.getMathScore()
                        + "  " + (st.getKorScore() + st.getEngScore() + st.getMathScore()) + "  " + ((double)(st.getKorScore() + st.getEngScore() + st.getMathScore())/3))
                .collect(Collectors.toList());


        // list는 student라는 타입을 가지고 있다.(14줄) st는 배열안의 요소 하나

        totalExam.stream().forEach(System.out::println);

    }
}
