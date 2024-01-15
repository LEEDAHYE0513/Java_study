package collection.Set;

public class Member {
     String name;
     Integer age;
    public Member(String name, Integer age){
        this.name = name;
        this.age = age;
    }
    public int hashCode(){
        return name.hashCode() + age;
    }

    public boolean equals(Object o){
        if (o instanceof Member m){
            return m.name.equals(name) && (m.age == age);
        }else {
            return false;
        }
    }
}
