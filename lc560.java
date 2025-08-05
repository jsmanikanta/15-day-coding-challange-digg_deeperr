import java.util.HashMap;
import java.util.Map;

public class lc560 {
    public static void main(String[] args) {
        int nums[]={1,1,1};
        int k=2;
        System.out.println(subarraySum(nums, k));
    }
    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
