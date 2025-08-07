public class lc35 {
    public static int searchInsert(int[] nums, int target) {
        int st=0;
        int end=nums.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target>nums[mid]){
                st=mid+1;
            }
            if(target<nums[mid]){
                end=mid-1;
            }
        }
        return st;
    }
    public static void main(String[] args) {
        int nums[] = {1,3,5,6};
        int target = 5;
        System.out.println(searchInsert(nums, target));
    }
}
