import java.util.HashMap;
import java.util.Map;

public class lc322 {
    public static int coinChange(int[] coins, int amount) {
        Map<Integer, Integer> memo = new HashMap<>();
        return helper(coins, amount, memo);
    }

    public static int helper(int[] coins, int amount, Map<Integer, Integer> memo) {
        if (amount == 0) return 0;       // no coins needed
        if (amount < 0) return -1;       // not possible
        if (memo.containsKey(amount)) return memo.get(amount);

        int min = Integer.MAX_VALUE;
        for (int coin : coins) {
            int res = helper(coins, amount - coin, memo);
            if (res >= 0 && res < min) {
                min = res + 1;  // add current coin
            }
        }

        int ans = (min == Integer.MAX_VALUE) ? -1 : min;
        memo.put(amount, ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        System.out.println(coinChange(coins, amount)); // Output: 3
    }
}
