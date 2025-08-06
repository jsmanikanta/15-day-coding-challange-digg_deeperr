public class lc704 {
    public static int search(int[] nums, int key) {
        int st=0;
        int end=nums.length-1;
        while(st<=end){
        int mid=st+(end-st)/2;
            if(nums[mid]==key){
              return mid;
            }else if(nums[mid]<key){ 
                st=mid+1;
            } if(nums[mid]>key){ 
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={-1,0,3,5,9,12};
        int key=9;
        System.out.println(search(nums, key));
    }
}
