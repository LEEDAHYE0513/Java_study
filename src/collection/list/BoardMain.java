package collection.list;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class BoardMain { //
//    public static void main(String[] args) {
//        BoardDao dao = new BoardDao();
//        List<Board> boardList = dao.getBoardList();
//
//
//        //dao에 전체 게시물의 수를 제공하는 메소드 boardSize() 작성하여 전체 게시무의 수를 확인해 주세요
//        dao.boardSize(boardList);
//
//        //dao에 전체 글을 조회하는 메소드인 getBoardAll()
//        dao.getBoardAll(boardList);
//
//        // boardList에 글쓴사람의 이름을 전달하여 해당 글쓴이를 확인한 후 있다면 글쓴이의 이름과 글 주제, 내용을 출력하세요
//        // writerSearch(String Writer ) 메소드를 작성하세요.
//        dao.writerSearch(Writer);
//
//        //dao에 boardInsert(String subject, String writer, String content) 메소드를 작성하여 새로운 글이 추가기능 구현 하세요
//        dao.boardInsert("쓰레드 프로그래밍1, "sym", ")
//
//
//        //두번째로 글 쓴 사람의 이름을 알고 싶다.
//        Board two = boardList.get(1);
//        System.out.println(two.getWriter());
//        two.setWriter("KJS");
//        System.out.println(two.getWriter());
//
//        //Board의 전체 글을 조회
//        for (
//                Board board : boardList
//        ){
//            System.out.println("전체 보기");
//            System.out.println(board.getWriter());
//            System.out.println(board.getSubject());
//            System.out.println(board.getContent());
//        }
//
//
//    }
//}
