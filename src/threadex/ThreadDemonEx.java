package threadex;

public class ThreadDemonEx {
    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();
        System.out.println("currentThread = " + t1); //현재 실행중인 스레드의 참조값을 반환하여 출력

        //ThreadEx11 스레드 t2만들어서 t2의 반환값 확인
        Thread t2 = new Thread(new ThreadEx11());
        System.out.println("t2: " +t2);
    }

}

    // ThreadEx1 클래스를 thread로 만드세요
class ThreadEx11 implements Runnable{
        @Override
        public void run() {

        }
    }
