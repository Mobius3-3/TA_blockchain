package string;

import java.util.Arrays;

public class stringbuilder {
    public static void main(String[] args) {
        String name = "Andrew";
        System.out.println(System.identityHashCode(name));
        name = "Andrew F.";
        System.out.println(System.identityHashCode(name));

        System.out.println("===========================");

        StringBuilder nameStringBuilder = new StringBuilder();
        nameStringBuilder.append("Andrew");
        System.out.println(System.identityHashCode(nameStringBuilder));
        nameStringBuilder.append(" F.");
        System.out.println(System.identityHashCode(nameStringBuilder));
    }
}
