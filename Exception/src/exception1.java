import java.util.Arrays;
import java.util.Scanner;

public class exception1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数字：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            int c = a / b;
            System.out.println(a + "/" + b + "=" + (c));
        }
        catch (Exception e) {
            System.out.println("发生异常" +e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
        finally {
            // 收尾工作，eg.资源释放
            System.out.println("不管程序有没有发生异常，这句话都会被打印");
        }
        System.out.println("程序执行完成");
    }
}
