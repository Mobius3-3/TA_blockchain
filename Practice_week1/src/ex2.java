import java.util.Set;
import java.util.HashSet;

public class ex2 {
    public static boolean twoSum(int[] nums, int target) {
        Set<Integer> looped = new HashSet();
        for (int n: nums) {
            if (looped.contains(target - n)) return true;
            looped.add(n);
        }
        return false;
    }
}
