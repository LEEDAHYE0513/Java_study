package threadex.interrupt;


import javax.swing.*;

public class ThreadDemo1 {
    //interrupt 메소드 : 쓰레드를 안전하게 종료시킬 때 사용한다.//스레드를 실행도중 종료시키고 싶을때 사용

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadEx1());
        t1.start();
        String yes = JOptionPane.showInputDialog("게임을 다시 진행할까요? [Y/N]");
        System.out.println("isITerrupted : " + t1.isInterrupted());
        t1.interrupt();
        System.out.println("isInterrupted : " + t1.isInterrupted());
    }

    static class ThreadEx1 extends Thread{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
            int i = 10;
            while (i !=0 && !isInterrupted()){
                System.out.println(i--);
                for (long x = 0; x < 2500000L ; x++){

                }
                System.out.println(Thread.currentThread().getName()+"카운트다운종료");
            }
        }
    }
}
