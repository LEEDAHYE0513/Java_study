package collection.yaho.first;

import java.util.Arrays;
import java.util.Comparator;


public class StudentMain {
    public static void main(String[] args) {
        Student student[] = new Student[5];
        //순서대로 "이름", 학번, 학점
        student[0] = new Student("Dave", 20240001, 4.2);
        student[1] = new Student("Amie", 20160001, 4.5);
        student[2] = new Student("Emma", 20110001, 3.5);
        student[3] = new Student("Brad", 20130001, 2.8);
        student[4] = new Student("Cara", 20140001, 4.2);

        System.out.println("[과제 1]");

        Arrays.sort(student);

        for (Student s : student)
            System.out.println(s.name + " " +s.id + " " +s.score);

        System.out.println("---------------------------");
        System.out.println("[과제 2]");
        Arrays.sort(student, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.score == o2.score) {
                    return Integer.compare(o1.id, o2.id);
                }
                return Double.compare(o2.score, o1.score);
            }
        });
//        for (Student s : student)
//            System.out.println(s.name + " " +s.id + " " +s.score);

        for (int i = 0; i < 2; i++) {
            System.out.println(student[i]);
        }
    }
}
