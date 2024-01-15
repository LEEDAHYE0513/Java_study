package stream.section3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionEx {
    public static void main(String[] args) {
        List<Member> memberList = Arrays.asList(
                new Member(1,"홍일동","M"),
                new Member(2,"홍이동","F"),
                new Member(3,"홍삼동","F"),
                new Member(4,"홍사동","M"),
                new Member(5,"홍오동","M"));

        //1. 남자회원만 "M" 따로 menlist에 저장하고 출력
        //방법1
        List<Member> menlist1 = memberList.stream().filter(member -> member.getGender().equals("M")).toList();
        //방법2
        List<Member> menlist2 = memberList.stream().filter(member -> member.getGender().equals("M")).collect(Collectors.toList());
        System.out.println(menlist1 + " "+menlist2);

        //2. 회원정보 리스트에서 이름만 추출하고 출력하세요
        //내가 적은 코드 ㅋㅋ List<Member> namelist = memberList.stream().filter(name -> name.getName()).toList();
        memberList.stream().forEach(member -> System.out.println(member.getName()));

        //3. 회원의 회원번호를 키로 회원이름을 값으로 하여 Map생성하고 출력하세요
        //1. 람다 방식
//      Map<Integer,String> map = memberList.stream()
//              .collect(Collectors.toMap(member -> member.getNo(),member -> member.getName()));

        //2. 메소드 참조 방식
        Map<Integer,String> map = memberList.stream()
                .collect(Collectors.toMap(Member::getNo, Member::getName));
                                         //클래스 이름::메소드 이름
        System.out.println(map);

        //"M" "F" 키로 설정하여 List<Member>를 값으로 갖는 Map을 생성하세요 . (M 밑에 남자들 집합 F 밑에 여자들 집합)
        Map<String,List<Member>> genderGroupMap
                = memberList.stream().collect(Collectors.groupingBy(Member::getGender));
        //groupingBy는 키값으로 묶는다는 의미이며 Map을 리턴한다. genderGroupMap 들어감.
        System.out.println("---------남성 회원 리스트------------");
        List<Member> maleMemberList = genderGroupMap.get("M");
        //"M"을 키값으로 갖는 것들을 가져와서 maleMemberList에 담는다.
        maleMemberList.stream().forEach(member -> System.out.println(member.getName()));
        System.out.println();
        System.out.println("---------여성 회원 리스트------------");
        List<Member> fmaleMemberList = genderGroupMap.get("F");
        fmaleMemberList.stream().forEach(member -> System.out.println(member.getName()));

    }
}
