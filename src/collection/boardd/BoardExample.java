//package collection.boardd;
//
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import java.util.Scanner;
//
//public class BoardExample {
//
//    private Scanner sc = new Scanner(System.in);
//    //Board라는 클래스를 담을 list를 만들어주는데 그것을 boards라고 정의함
//    private List<Board> boards = new ArrayList<Board>();
//
//
//
//    public void list(){
//        System.out.println("[게시판 목록]");
////        System.out.println("-------------------------");
////        System.out.printf("%-6s%-12s%-16s%-40s\n", "no","writer","date","title");
////        System.out.println();
////        System.out.println("-------------------------");
////        System.out.printf(%-6s%-12s%-16s%-40s\n", "1","winter","2024.01.02","게시판에오신 것을 환영합니다.");
////        System.out.printf("%-6s%-12s%-16s%-40s\n", "2","winter","2024.01.01","올 겨울은 많이 춥습니다.");
//          mainMenu();
//    }
//
//    public void mainMenu() {
//        System.out.println();
//        System.out.println("-------------------------");
//        System.out.println("메인 메뉴: 1. Create | 2. Read | 3. Clear | 4. Exit ");
//        System.out.println("메뉴 선택: ");
//        String menuNo = sc.nextLine();
//        System.out.println();
//
//        switch (menuNo){
//            case "1" -> create();
//            case "2" -> read();
//            case "3" -> clear();
//            case "4" -> exit();
//        }
//
//        System.out.println();
//    }
//
//
//    private void create() {
//        System.out.println("***create()메소드 실행됨");
//        Board row = new Board();
//        System.out.println("[새 게시물 입력]");
//
//        row.setBno(boards.size() + 1);
//        System.out.println("제목 : ");
//        row.setBtitle(sc.nextLine());
//        System.out.println("내용 : ");
//        row.setBcontent(sc.nextLine());
//        System.out.println("작성자 : ");
//        row.setBwriter(sc.nextLine());
//        //이거 받으라고 안되있는데 왜? 게시물 목록에 date가 있으니!!
//        row.setBdate(getCurrentDate());
//
//        System.out.println("-------------------------");
//        System.out.println("보조 메뉴 : 1. Ok 2. Cancel");
//        System.out.println("메뉴 선택 : ");
//        String menuNo = sc.nextLine();
//        if (menuNo.equals("1")){
//            try {
//                boards.add(row);
//                System.out.println("게시물 추가 완료!");
//            } catch (Exception e){
//                System.out.println(e.getMessage());
//                exit();
//            }
//        } list();
//    }
//
//    private String getCurrentDate() {
//        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
//        String currentDate = date.format(new Date());
//        return currentDate;
//    }
//
//
//    private void read() {
//        System.out.println("***read()메소드 실행됨");
//        System.out.println("전체 게시물 출력");
//        for (Board row : boards)
//            System.out.printf("%-6s%-12s%-16s%-40s\n", row.getBno(),row.getBwriter(),row.getBdate(), row.getBtitle());
//        System.out.println("원하시는 게시물의 번호가 있으면 입력해주세요");
//        int bno = Integer.parseInt(sc.nextLine());
//        readOne(bno);
//        list();
//    }
//
//
//    private void read (){
//        System.out.println("***read()메소드 ");
//    }
//
//    private void readOne(int bno) {
//        boolean bool = true;
//        System.out.println("#########");
//
//        for (Board row : boards){
//            if (row.getBno() == bno){
//                System.out.printf("%-6s%-12s%-16s%-40s\n", row.getBno(),row.getBwriter(),row.getBdate(), row.getBtitle());
//                bool = false;
//            }
//        }
//        if (bool == true){
//            System.out.println("게시글이 없습니다.");
//            list();
//        }
//        System.out.println("#########");
//        System.out.println("보조메뉴 : 1. Update | 2. Delete | 3. List");
//        System.out.println("메뉴 선택 : ");
//        String menuNo = sc.nextLine();
//        if (menuNo.equals("1")){
//            update(bno);
//        } else if (menuNo.equals("2")) {
//            delete(bno);
//        }
//    }
//
//    public void update(int bno){
//        System.out.println("[수정 내용 입력]");
//        System.out.println("제목 : ");
//        String motitle = sc.nextLine();
//        System.out.println("내용 : ");
//        String mocontent = sc.nextLine();
//        System.out.println("작성자 : ");
//        String mowriter = sc.nextLine()] ;;
//
//        System.out.println("-------------------");
//        System.out.println("보조 메뉴 : 1. Ok | 2. Cancel");
//        System.out.println("메뉴 선택 : ");
//        String menuNo = sc.nextLine();
//        if (menuNo.equals("1")){
//            try{
//                for (Board board : boards){
//                    if (board.getBno()==bno){
//                        board.setBtitle(motitle);
//                        board.setBcontent(mocontent);
//                        board.setBwriter(mowriter);
//                        System.out.println("게시물 수정 완료");
//                        break;
//                    }
//                }
//            }catch (Exception e){
//                System.out.println(e.getMessage());
//                exit();
//            }
//        }list();
//    }
//
//
//    private void delete(int bno) {
//        try{
//            boards.remove(bno-1);
//            list();
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//    }
//
//    private void clear() {
//        System.out.println("***clear()메소드 실행됨");
//        System.out.println("[게시물 전체 삭제]");
//        System.out.println("-----------------------");
//        System.out.println("보조 메뉴 1. Ok | 2. Cancel");
//        System.out.println("메뉴 선택 : ");
//        String menuNo = sc.nextLine();
//        if (menuNo.equals("1")){
//            boards.clear();
//        }list();
//    }
//
//    private void exit() {
//        System.out.println("***exit()메소드 실행됨");
//        System.out.println("**게시판 종료");
//    }
//
//    public static void main(String[] args) {
//        BoardExample boardExample = new BoardExample();
//        boardExample.list();
//        Board board = new Board();
//        board.toString();
//
//    }
//}
