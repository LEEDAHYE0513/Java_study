package collection.app;

public class Member implements Comparable<Member>{
    public String name;
    public Integer age;

    public Member(String name, Integer age){
        this.name = name;
        this.age = age;
    }
      /* public int hashCode(){
           return
           //return name.hashCode() + age;
       }*/

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    public boolean equals(Object o){
        if(o instanceof Member m){
            return m.name.equals(name) && (m.age == age);
        }else {
            return false;
        }
    }
    //Member o 주체가 나. 기존 값이1 새로 들어오는 값이랑 계속 비교.
    public int compareTo(Member o) {
        if(age<o.age) return -1;
        else if(age == o.age) return 0;
        else return 1;

    }
}