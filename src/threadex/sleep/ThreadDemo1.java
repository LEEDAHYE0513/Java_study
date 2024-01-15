package threadex.sleep;

import javax.swing.*;

public class ThreadDemo1 {
    public static void main(String[] args) {

        for (int i = 1; i <=2 ; i++) {

        }






        // ThreadEx1 t1, t2 생성하여 시작시켜주세요.   t1은 2초 마다 쉬면서 동작하도록
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        t1.start();
        t2.start();
        //ThradEx1은
        //동작순서 1. 자신의 이름을 출력 2. * 20번 출력하는 동작을 합니다. 3. * 20번 출력한 후 자신의 [이름, 종료] 메시지 출력

        String name = JOptionPane.showInputDialog("이름을 입력하세요!");
        System.out.println("이름은 " + name + "입니다.");

        for (int i = 20; i > 0; i--) {
            System.out.println(name);
            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {
            }
        }
        System.out.println("이름은: "+ name+ "이며 종료되었습니다.");
    }

}
