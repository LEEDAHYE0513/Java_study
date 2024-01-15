package collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMain {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        boolean check = false;
        check=set.add("신세계 자바 과정1");
        System.out.println(check);
        check=set.add("신세계 자바 과정2");
        System.out.println(check);
        check=set.add("신세계 자바 과정3");
        System.out.println(check);
        check=set.add("신세계 자바 과정3");
        System.out.println(check);
        int size = set.size();
        System.out.println(size);

        //멤버 클래스로 구성된 HashSet을 만드는데 이것을 Members라고 지칭한다.
        Set<Member> members = new HashSet<Member>();

        members.add(new Member("최문석", 33));
        members.add(new Member("윤여빈", 21));
        members.add(new Member("윤여빈", 21));

        System.out.println(members.size());

        // 객체를 하나씩 가져와서 처리
        //Iterator는 배열을 순회한다.

        //set인 Member를 돌아다니는 iterator를 선언
        Iterator<Member> iterator = members.iterator();

        //members안에 있는 Member를 iterator가 다음node를 찾는다
        while(iterator.hasNext()){
            Member member = iterator.next();

            //"최문석", 33, "윤여빈", 21, "윤여빈", 21 출력해야 하지만 HashSet은 중복을 허용하지 않아 "최문석", 33, "윤여빈", 21이 출력된다.
            System.out.println(member.age + " " + member.name);
            if (member.name.equals("최문석")){
                iterator.remove();      //순회하다 "최문석", 33을 삭제한다.
            }

        }System.out.println("-------------");
        //"윤여빈", 21, "윤여빈"이 남았지만 중복을 허용하지 않아 "윤여빈", 21만 출력된다.
        for (Member member : members)
            System.out.println(member.age + " "+ member.name);



    }
}
