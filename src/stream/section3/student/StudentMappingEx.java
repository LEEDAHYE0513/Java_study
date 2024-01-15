//package stream.section3.student;
//
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//import stream.section3.student.Student;
//public class StudentMappingEx {
//    public static void main(String[] args) {
//
//        //1. Student 클래스 타입의 stulist 리스트 컬렉션을 생성하세요
//        List<Student> stulist = new ArrayList<>();
//
//        // 2. Scanner 클래스로 학생의 이름과 성적을 입력받아 5명의 학생 객체를 stulist에 저장하세요
//        Scanner sc = new Scanner(System.in);
//        String stuname = null;
//        String scores = null;
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("학생의 이름을 입력해주세요");
//            stuname = sc.nextLine();
//            System.out.println("학생의 성적을 국어 영어 수학 순서대로 입력해주세요");
//            scores = sc.nextLine();
//            String[] score = scores.split(" ");
//            Student student = new Student(stuname,Integer.parseInt(score[0]),Integer.parseInt(score[1]),Integer.parseInt(score[2]));
//            stulist.add(student);
//        }
//        stulist.stream().forEach(System.out::println);
//        // 3. 학생별 이름만 저장한 namelist를 만들고 출력하세요
//        //Stream<String> namelist = stulist.stream().map(Student::getName);
//        //namelist.stream().forEach(System.out::println);
//
//
//        // 4. 학생별 국어점수를 저장한 korScoreList 만들고 출력하세요
//
//        // 5. 국어점수의 총합과 평균을 구하여 출력하세요
//        // 6. 학생별 영어점수를 저장한 engScoreList 만들고 출력하세요
//        // 7. 영어점수의 총합과 평균을 구하여 출력하세요
//        // 8. 학생별 수학점수를 저장한 mathScoreList 만들고 출력하세요
//        // 9. 수학점수의 총합과 평균을 구하여 출력하세요
//        // 10. 학생별 총합 점수와 평균을 구하여 totalExam에 저장하여 최종 성적표를 출력하세요.
//
//
//    }
//}
//
//
