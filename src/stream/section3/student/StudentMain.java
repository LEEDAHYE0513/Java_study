//package stream.section3.student;
//
//import stream.section3.student.Student;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class StudentMain {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        //1. Student 클래스 타입의 stulist 리스트 컬렉션을 생성하세요
//        List<Student> stulist = new ArrayList<>();
//
//        // 2. Scanner 클래스로 학생의 이름과 성적을 입력받아 5명의 학생 객체를 stulist에 저장하세요
//        for (int i = 0; i < 5; i++) {
//            System.out.println("입력해라");
//            String[] student = sc.nextLine().split(" ");
//            stulist.add(new Student(student[0], Integer.parseInt(student[1]),Integer.parseInt(student[2]),Integer.parseInt(student[3])));
//        }
//        // 3. 학생별 이름만 저장한 namelist를 만들고 출력하세요
//        List<String> namelist = stulist.stream().map()
//        // 4. 학생별 국어점수를 저장한 korScoreList 만들고 출력하세요
//        // 5. 국어점수의 총합과 평균을 구하여 출력하세요
//        // 6. 학생별 영어점수를 저장한 engScoreList 만들고 출력하세요
//        // 7. 영어점수의 총합과 평균을 구하여 출력하세요
//        // 8. 학생별 수학점수를 저장한 mathScoreList 만들고 출력하세요
//        // 9. 수학점수의 총합과 평균을 구하여 출력하세요
//        // 10. 학생별 총합 점수와 평균을 구하여 totalExam에 저장하여 최종 성적표를 출력하세요.
//
//    }
//}
