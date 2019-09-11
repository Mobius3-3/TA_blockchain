//package collection;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class list {
//
//    public static List<String>[] groupString(List<String> input) {
//        List<String>[] ans = new List[3];
//        for (String in : input) {
//            if (in.charAt(0) == 'a') {
//                List<String> lst;
//                if (ans[0] == null) {
//                    lst = new ArrayList<>();
//                } else {
//                    lst = ans[0];
//                }
//                lst.add(in);
//                ans[0] = lst;
//            } else if (in.charAt(0) == 'b') {
//                List<String> lst;
//                if (ans[1] == null) {
//                    lst = new ArrayList<>();
//                } else {
//                    lst = ans[1];
//                }
//                lst.add(in);
//                ans[1] = lst;
//            } else {
//            // to do: create ans[2] and append elements into it
//            }
//        }
//        return ans;
//    }
//
//    public static void main(String[] args) {
//        List<String> input = Arrays.asList("abc", "bcd", "bbb", "ace", "snb", "aaaa", "bbbbb", "eeee");
//        for (List<String> lst : groupString(input)) {
//            System.out.println(lst);
//            System.out.println();
//        }
//    }
//}