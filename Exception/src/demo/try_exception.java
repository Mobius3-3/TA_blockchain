package demo;

import java.util.Arrays;

public class try_exception {
    public static void main(String[] args) {
        try {
            int data = 100/0;
        } catch(ArithmeticException e) {
            System.out.println("wrong calculation!");
        }
    }
}
