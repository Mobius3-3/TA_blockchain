import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.List;
public class ex4 {
    public static List<Integer> findTopk(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k);
            for (int i=0; i<nums.length; i++) {
                maxHeap.add(-1*nums[i]);
            }
        List<Integer> res = new ArrayList<>();
        int i = 0;
        while (i<k){
            res.add(-1*maxHeap.poll());
            i++;
        }
        return res;
    }
}
