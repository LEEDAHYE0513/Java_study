package stream.section3.student;


public class Student2 implements Comparable<Student2>{
    private String name; //이름

    private Integer score;


    public String getName() {
        return name;
    }

    public Integer getscore() {
        return score;
    }



    public Student2(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", korscore=" + score +
                '}';
    }

    @Override
    public int compareTo(Student2 o) {
        return Integer.compare(score,o.score);
    }
}

