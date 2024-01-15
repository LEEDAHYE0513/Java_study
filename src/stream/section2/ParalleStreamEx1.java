//package stream.section2;
//
//import stream.section2.student.Student;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Stream;
//
//public class ParalleStreamEx1 {
//
//
//    //List 컬렉션의 내부 반복자를 이용해서 병렬처리를 하는 방법
//    //ParallelStream() :  병렬 처리 시스템
//
//
//    public static void main(String[] args) {
//        List<String> names = Arrays.asList("김진성","강호동","유재석","신동엽","서장훈");
//
//        //쓰레드가 각각 처리한다. 동시 병렬처리가 가능하다.
//        Stream<String> paralleStream = names.parallelStream();
//        paralleStream.forEach( name -> {
//            System.out.println(name + ":" + Thread.currentThread().getName());
//        }
//        );
//
//        List<Student> studentList = Arrays.asList(new Student("김진성",90),
//        new Student("강호동",80),
//        new Student("유재석",70),
//        new Student("신동엽",50),
//        new Student("서장훈",30));
//        System.out.println();
//
//        Double average = studentList.stream().mapToInt(stu->stu.getScore()).average().getAsDouble();
//        System.out.println(average);
//    }
//}
