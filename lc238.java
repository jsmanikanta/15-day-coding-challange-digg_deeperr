public class lc238 {
    public static int[] productExceptSelf(int[] nums) {
      int n=nums.length;
        int i=0;
        int product=1;
        int zerocount=0;
        while(i<n){
            if(nums[i]!=0){
                product=product*nums[i];
            }else{
                zerocount++;
            }
            i++;
        }
        int[] result = new int[n];
        for (int j = 0; j < n; j++) {
            if(zerocount==1){
                result[j] = (nums[j] == 0) ? product : 0;
            }else if(zerocount>1){
                result[j]=0;
            }else{
                result[j]=product/nums[j];
            }
        }
        return result;  
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        int arr[]=productExceptSelf(nums);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}