//package stream.section3.student;
//
//
//import stream.section3.SortingComparableEx;
//
//public class Student implements Comparable<Student>{
//    private String name; //이름
//
//    private Integer korscore;
//    private Integer engscore;
//    private Integer mathscore;
//
//
//    public String getName() {
//        return name;
//    }
//
//    public Integer getKorscore() {
//        return korscore;
//    }
//
//    public Integer getEngscore() {
//        return engscore;
//    }
//
//    public Integer getMathscore() {
//        return mathscore;
//    }
//
//    public Student(String name, Integer korscore, Integer engscore, Integer mathscore) {
//        this.name = name;
//        this.korscore = korscore;
//        this.engscore = engscore;
//        this.mathscore = mathscore;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", korscore=" + korscore +
//                ", engscore=" + engscore +
//                ", mathscore=" + mathscore +
//                '}';
//    }
//
//
//    @Override
//    public int compareTo(Student o) {
//        return 0;
//    }
//}
//
