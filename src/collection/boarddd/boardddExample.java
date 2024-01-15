//package collection.boarddd;
//
//
//import java.util.Scanner;
//
//public class boardddExample {
//    private Scanner sc = new Scanner(System.in);
//
//    private void list(){
//        System.out.println("[게시물 목록]");
//        System.out.println("----------------------------------");
//        System.out.printf("%-6s%-12s%-16s%-40s\n","no","writer","date","title");
//        System.out.println("----------------------------------");
//        mainMenu();
//    }
//
//    private void mainMenu(){
//        System.out.println();
//        System.out.println("------------------------");
//        System.out.println("메인 메뉴: 1. Create   |   2. Read  |   3. Clear    |   4. Exit");
//        System.out.println("메뉴선택: ");
//        String menuNo = sc.nextLine();
//        System.out.println();
//
//        switch (menuNo){
//            case "1" -> create();
//            case "2" -> read();
//            case "3" -> Clear();
//            case "4" -> Exit();
//        }
//    }
//    private void create(){
//        System.out.println("*** create() 메소드 실행됨");
//        System.out.println("[새 게시물 입력]");
//        boarddd row = new boarddd();
//
//        row.setBno(boarddd.size()+1);
//    }
//    private void read(){
//        System.out.println("*** read() 메소드 실행됨");
//
//    }
//    private void Clear(){
//        System.out.println("*** clear() 메소드 실행됨");
//
//    }
//    private void Exit(){
//        System.out.println("*** exit() 메소드 실행됨");
//
//    }
//
//
//
//
//
//
//
//    public static void main(String[] args) {
//
//    }
//
//}
