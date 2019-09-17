import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class ex1 {
//  //solution1:
//    public static int findDuplicate(String input) {
//        char[] chars = input.toCharArray();
//        HashMap<Character, Integer> pos_map = new HashMap<>();
//        for (int i=0; i<chars.length; i++) {
//            if (pos_map.containsKey(chars[i])) return i;
//            else pos_map.put(chars[i],i);
//        }
//        return -1;
//    }
    // solution2
    public static int findDuplicate(String input) {
        Set<Character> seen = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            if (seen.contains(input.charAt(i))) {
                return i;
            } else {
                seen.add(input.charAt(i));
            }
        }
        return -1;
    }
}
