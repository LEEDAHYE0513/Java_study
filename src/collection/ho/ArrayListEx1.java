package collection.ho;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        //int형 데이터를 받을 수 있는 ArrayList 타입의 List1 객체 생성
        List<Integer> list1 = new ArrayList<>();
        //list1에 10 값을 추가해주세요
        list1.add(10);
        list1.add(20);
        //list1에 저장된 모든 객체를 출력

        //1번 방법
        for (
                Integer i : list1
        ) {
            System.out.println(i);
        }

        //2번 방법
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));

        }

        //list1의 인덱스 2번의 값을 20 ==> 100으로 변경
        list1.set(1, 100);
        System.out.println(list1.get(1));

        //list1의 인덱스 1번의 객체 삭제
        list1.remove(1);
        //System.out.println(list1.get(1));
        System.out.println(list1.size());


        // 정수형 타입으로 2행 5열 배열 생성하고 1,2,3,4,5     6,7,8,9,10 초기화하여 할당하세요
        Integer idata[][] = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};

        //5 출력
        System.out.println(idata[0][4]);
        //8출력
        System.out.println(idata[1][2]);

        Integer[][][] data_list = {
                {
                        {1, 2, 3},
                        {4, 5, 6}
                },
                {
                        {7, 8, 9},
                        {10, 11, 12}
                }
        };
        //11 출력
        System.out.println(data_list[1][1][1]);


        String dataset[] = {
                "Braund, Mr. Owen Harris",
                "Cumings, Mrs. John Bradley (Florence Briggs Thayer)",
                "Heikkinen, Miss. Laina",
                "Futrelle, Mrs. Jacques Heath (Lily May Peel)",
                "Allen, Mr. William Henry",
                "Moran, Mr. James",
                "McCarthy, Mr. Timothy J",
                "Palsson, Master. Gosta Leonard",
                "Johnson, Mrs. Oscar W (Elisabeth Vilhelmina Berg)",
                "Nasser, Mrs. Nicholas (Adele Achem)",
                "Sandstrom, Miss. Marguerite Rut",
                "Bonnell, Miss. Elizabeth",
                "Saundercock, Mr. William Henry",
                "Andersson, Mr. Anders Johan",
                "Vestrom, Miss. Hulda Amanda Adolfina",
                "Hewlett, Mrs. (Mary D Kingcome) ",
                "Rice, Master. Eugene",
                "Williams, Mr. Charles Eugene",
                "Vander Planke, Mrs. Julius (Emelia Maria Vandemoortele)",
                "Masselmani, Mrs. Fatima",
                "Fynney, Mr. Joseph J",
                "Beesley, Mr. Lawrence",
                "McGowan, Miss. Anna",
                "Sloper, Mr. William Thompson",
                "Palsson, Miss. Torborg Danira",
                "Asplund, Mrs. Carl Oscar (Selma Augusta Emilia Johansson)",
                "Emir, Mr. Farred Chehab",
                "Fortune, Mr. Charles Alexander",
                "Dwyer, Miss. Ellen",
                "Todoroff, Mr. Lalio"
        };

        //dataset 1차원 배열에서 문자 'M'을 가지고 있는 아이템의 수를 출력
        Integer count = 0;
        for(Integer item = 0; item < dataset.length; item++){

            if (dataset[item].indexOf("i")>=0){
                count++;
            }
        }
    }


}
