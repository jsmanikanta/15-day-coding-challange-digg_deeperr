public class lc121 {
    public static int maxProfit(int[] prices) {
        int bp=Integer.MAX_VALUE;
        int prof=0;
        for(int i=0;i<prices.length;i++){
            if(bp<prices[i]){
                int profit = prices[i]-bp;
                prof=Math.max(prof,profit);

            }
            else bp= prices[i];
        }
        return prof;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}