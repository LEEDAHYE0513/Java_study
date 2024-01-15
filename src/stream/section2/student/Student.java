package stream.section2.student;


public class Student {
    private String name; //이름

    private Integer KorScore;

    private Integer engScore;
    private Integer mathScore;

    public Student(String name, Integer korScore, Integer engScore, Integer mathScore) {
        this.name = name;
        KorScore = korScore;
        this.engScore = engScore;
        this.mathScore = mathScore;
    }

    public Student(String name, Integer korScore) {
        this.name = name;
        KorScore = korScore;
    }

    public String getName() {
        return name;
    }

    public Integer getKorScore() {
        return KorScore;
    }

    public Integer getEngScore() {
        return engScore;
    }

    public Integer getMathScore() {
        return mathScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", KorScore=" + KorScore +
                ", engScore=" + engScore +
                ", mathScore=" + mathScore +
                '}';
    }
}
