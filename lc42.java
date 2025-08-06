public class lc42 {
    public static int trap(int[] height) {
        int n=height.length;
        int[] lmax= new int[n];
        lmax[0]=height[0]; 
        int[] rmax= new int[n]; 
        rmax[n-1]=height[n-1];
        // for lft array 
        for(int i=1;i<n;i++){
            lmax[i]=Math.max(lmax[i-1],height[i]); // comparing the height with previous one 
        }
        for(int i=n-2;i>=0;i--){
            rmax[i]=Math.max(rmax[i+1],height[i]); // comparing the height with previous one 
        }
        int trapped=0;
        for(int i=0;i<n;i++){
            trapped+=Math.min(lmax[i],rmax[i])-height[i];
        }
        return trapped;
    }
    public static void main(String[] args) {
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
