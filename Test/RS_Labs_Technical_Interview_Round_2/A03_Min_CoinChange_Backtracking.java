/*
Write a program to find minimum number of coins to tender an exact change for the sum of amount
Available denominations are 2s and 5s.
For example, if input is 30, output should be 6 coins of 5s
Anoop Nyati14:34
30 = 6 coins of 5s
32 = 6 coins of 5s and 1 coin of 2s
Anoop Nyati14:37
33 = 5 coins of 5s and 4 coin of 2s

*/

package RS_Labs_Technical_Interview_Round_2;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class A03_Min_CoinChange_Backtracking {

	public static void main(String[] args) {
		int[] coins = {2, 5};
		int sum = 33;
		
		int dp[] = minCoin(coins, sum);
		System.out.println(dp[sum]);
		backtrackSolution(coins, dp, sum);
		System.out.println(minCoinRec(coins, sum));
	}

	private static void backtrackSolution(int[] coins, int[] dp, int sum) {
		Queue<Integer> q = new ArrayDeque<>();
		
	}

	private static int[] minCoin(int[] coins, int sum) {
		int n = coins.length;
		int[] dp = new int[sum+1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		for(int i=1; i<dp.length; i++) {
			for(int j=0; j<n; j++) {
				if( coins[j] <= i ) {
					int count = dp[i - coins[j]];
					if( count != Integer.MAX_VALUE ) {
						dp[i] = Math.min(dp[i], count + 1);
					}
				}
			}
		}
		return dp;
	}
	
	private static int minCoinRec(int[] coins, int sum) {
		if( sum <= 0 ) {
			return 0;
		}
		int minCount = Integer.MAX_VALUE;
		for(int i=0; i<coins.length; i++) {
			
			if(coins[i] <= sum) {
				int count = minCoinRec(coins, sum - coins[i]);
				if( count != Integer.MAX_VALUE ) {
					minCount = Math.min(minCount, count + 1);
				}
			}
		}
		
		return minCount;
	}

}
