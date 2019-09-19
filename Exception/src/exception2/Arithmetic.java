package exception2;

public class Arithmetic {
    public void test(int a, int b) {
        try {
            int c = a / b;
            System.out.println(a +" + "+ b +" = " + c);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            throw e;
        }
        System.out.println("方法执行完成！");
    }
}
