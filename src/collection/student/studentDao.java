//package collection.student;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class studentDao {
//
//    List<Student> studentList = new ArrayList<>();
//
//    public studentDao(String stuno, String name) {
//        Student student = new Student(stuno, name);
//        studentList.add(student);
//        System.out.println("학생이 추가되었습니다.");
//
//    }
//
//    public Student studentExamInsert( int kor, int eng, int math) {
//        System.out.println("======studentExamInsert=============");
//        Student student = new Student();
//        //studentlist안에 수많은 student객체들이 있는데 각 s마다 점수입력을 해주겠다.
//               System.out.println("점수입력을 시작하겠습니다.");
//               student.setEng(eng);
//               student.setKor(kor);
//               student.setMath(math);
//               studentList.add(student);
//               System.out.println(student.getKor()+student.getEng()+student.getMath());
//               System.out.println("성적 입력이 완료되었습니다.");
//
//
//       return student;
//    }
//
//    public void studentRecordPrint(Student student){
//        System.out.println("======studentRecordPrint=============");
//        //총점
//        int sum =0;
//        sum = student.getKor()+ student.getEng()+student.getMath();
//
//        System.out.println(sum);
//
//        //평균
//        double avg =0;
//        avg = (double) sum/3;
//
//        System.out.println(avg);
//    }
//
//
//    public void studentUpdate(Student student, int restuko, int restueng, int restumath){
//        System.out.println("======studentUpdate=============");
//        student.setKor(restuko);
//        student.setEng(restueng);
//        student.setMath(restumath);
//        System.out.println("수정 되엇습니다.");
//        System.out.println("s.getKor()" + student.getKor());
//        System.out.println("s.getEng()" + student.getEng());
//        System.out.println("s.getMath()" + student.getMath());
//    }
//
//    public void studentPrintALl(){
//        System.out.println("======studentPrintALl=============");
//        for (Student s :studentList){
//            System.out.println("s.getStuno()" + s.getStuno());
//            System.out.println("s.getName()" + s.getName());
//            System.out.println("s.getKor()" + s.getKor());
//            System.out.println("s.getEng()" + s.getEng());
//            System.out.println("s.getMath()" + s.getMath());
//        }
//    }
//
//    public void studentPickPrint(String stuno){
//        System.out.println("======studentPickPrint=============");
//        boolean flag = true;
//        for (Student s : studentList) {
//            if (s.getStuno().equals(stuno)) {
//                flag = false;
//                System.out.println("s.getStuno()" + s.getStuno());
//                System.out.println("s.getName()" + s.getName());
//                System.out.println("s.getKor()" + s.getKor());
//                System.out.println("s.getEng()" + s.getEng());
//                System.out.println("s.getMath()" + s.getMath());
//                break;
//            }
//        }if (flag==true){
//            System.out.println("해당 학번인 stuno가 없습니다.");
//        }
//    }
//
//    public Student findStudent(String stuno){
//        for (Student s : studentList) {
//            if (s.getStuno().equals(stuno)) {
//                return s;
//            }
//        } return new Student();
//    }
//}
