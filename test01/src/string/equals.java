package string;

import java.util.Arrays;

public class equals {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        //按住ctrl同时点击equals，即可查看equals方法的实现
        System.out.println(s1.equals(s3));
    }

}

