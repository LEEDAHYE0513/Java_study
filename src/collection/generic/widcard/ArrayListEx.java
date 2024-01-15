//package collection.generic.widcard;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
//
//public class ArrayListEx {
//
//    public static <T extends Comparable<T> & Cloneable>void printList(List<T> list){
//        list.forEach(System.out::println);
//    }
//
//    public static void main(String[] args) {
//        List<Integer> numberList = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
//        List<String> stringList = new ArrayList<>(List.of("lee","kim","jin"));
//        printList(numberList);
//        printList(stringList);
//
//        // board 게시글을 저장한 리스트를 만들어 해당 글 내용(content)을 출력하도록
//
//
//        Bboard board1 = new Bboard("제목","내용","작성자");
//        Bboard board2 = new Bboard("제목","내용","작성자");
//        Bboard board3 = new Bboard("제목","내용","작성자");
//        List<Bboard> boardList = new ArrayList<>(List.of(board1,board2,board3));
//        printList(boardList);
//
//    }
//}
//
//
//
//
//
//
//
//
//
//
////    public static <T extends Comparator<T>>void printList(List<?> list){
////        list.forEach(System.out::println);
////    }
