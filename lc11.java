public class lc11 {
    public static int maxArea(int[] height) {
        int maxwater=0;
        int i=0,j=height.length-1;//i=left pointer,j=right pointer
        while(i<j){
                int ht=Math.min(height[i],height[j]);
                int wth=j-i;
                int currwater=ht*wth;
                maxwater=Math.max(maxwater,currwater);
            if(height[j]>height[i]){
                i++;// 'i' moves forward
            } else{
                j--;// 'j' moves forward
            }
        }
        return maxwater;
    }
    public static void main(String[] args) {
        int height[]= {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
