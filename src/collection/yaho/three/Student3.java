//package collection.yaho.three;
//
//public class Student3 {
//    String name; //이름
//    int id; //학번
//    double score; //학점
//    public Student3(String name, int id, double score){
//        this.name = name;
//        this.id = id;
//        this.score = score;
//    }
//    public String toString(){ //출력용 toString오버라이드
//        return "이름: "+name+", 학번: "+id+", 학점: "+score;
//    }
//
//    @Override
//    public int compareTo(NotNull Student3 o){
//        if(id < o.id) return -1; //내림차순
//        else if ((id == o.id)) {
//            return 0;
//        }else return 1; //오름차순
//    }
//}
