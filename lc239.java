import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class lc239 {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0) return new int[0];
        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> dq = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            while (!dq.isEmpty() && dq.peek() < i - k + 1) {
                dq.poll();
            }
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }
            dq.offer(i);  
            if (i >= k - 1) {
                result[i - k + 1] = nums[dq.peek()];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        String str=Arrays.toString(maxSlidingWindow(nums, k));
        System.out.println(str);
    }
}
