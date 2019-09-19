package exception2;

import java.util.Arrays;

public class throwexception {
    public static void main(String[] args) {
        Arithmetic a = new Arithmetic();
        try {
            a.test(2,0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("程序执行完毕！");
    }
}
