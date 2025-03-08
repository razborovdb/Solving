package amazon2.coinchange;

import java.util.Arrays;

public class CoinChange {
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        for (int i = 1; i <= amount; i++ ) {
            dp[i] = Integer.MAX_VALUE;
            for (int coin : coins) {
                if (coin <= i && dp[i-coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i-coin] + 1);
                }
            }
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        // 3
        int[] nums = {1,2,5};
        System.out.println(coinChange(nums, 11));
    }
    // previous solve
//    public static int coinChange(int[] coins, int amount) {
//        int[] dp = new int[amount + 1];
//        Arrays.fill(dp, 1, dp.length, amount + 1);
//        for (final int coin : coins)
//            for (int i = coin; i <= amount; ++i)
//                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
//        return dp[amount] == amount + 1 ? -1 : dp[amount];
//    }
    // one more previoius solve
//    static int solveCoinChange(int[] denominations, int amount) {
//        int[] solution = new int[amount + 1];
//        solution[0] = 1;
//        for (int den: denominations) {
//            for (int i = den; i < (amount + 1); ++i) {
//                solution[i] += solution[i - den];
//            }
//
//        }
//        return solution[solution.length - 1];
//    }
}
