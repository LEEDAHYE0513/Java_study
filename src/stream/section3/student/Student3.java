package stream.section3.student;


public class Student3 implements Comparable<Student3>{
    private String name; //이름

    private Integer score;


    public String getName() {
        return name;
    }

    public Integer getscore() {
        return score;
    }



    public Student3(String name, Integer score) {
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
    public int compareTo(Student3 o) {
        return Integer.compare(score,o.score);
    }
}

