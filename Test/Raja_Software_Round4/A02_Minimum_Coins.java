/* 
 Sample Input
 arr = { 1, 2, 5 } amt = 11
 Sample Output
 3
 
 Sample Input
 arr = { 2, 6 } amt = 7
 Sample Output
 -1
  
*/


package Raja_Software_Round4;

public class A02_Minimum_Coins {

	public static void main(String[] args) {
		int[] arr = {1, 2, 5};
		int amt = 11;
		int n = arr.length;
		int[][] dp = new int[n+1][amt+1];
		for(int i = 0; i < dp.length; i++) {
			for(int j = 0; j < dp[0].length; j++) {
				if(i == 0 && j == 0) {
					dp[i][j] = 0;
				} else if( i == 0 ) {
					dp[i][j] = Integer.MAX_VALUE;
				} else if( j == 0 ) {
					dp[i][j] = 0; 
				} else {
					if( j - arr[i-1] >= 0 ) {
						dp[i][j] = Math.min( dp[i-1][j] , dp[i][j - arr[i-1]] + 1);
					} else {
						dp[i][j] = dp[i-1][j];
					}
				}
			}
		}
		if( dp[n][amt] == Integer.MAX_VALUE-1 ) {
			System.out.println(-1);
			return;
		}
		System.out.println(dp[n][amt]);
	}

}
