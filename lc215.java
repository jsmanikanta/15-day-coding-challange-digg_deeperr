import java.util.Arrays;

public class lc215 {
    public  static int findKthLargest(int[] nums, int k) {
        int large=nums[0];
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if((nums.length-i)==k){
                large=nums[i];
            }
        }
        return large;
    }
    public static void main(String[] args) {
        int nums[]={3,2,1,5,6,4};
        int k=2;
        System.out.println(findKthLargest(nums, k));
    }
}