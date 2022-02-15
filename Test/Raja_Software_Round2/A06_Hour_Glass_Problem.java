/*

Sample Input
5
5
1 2 3 0 0 
0 0 0 0 0
2 1 4 0 0 
0 0 0 0 0
1 1 0 1 0
Sample Output
13

Sample Input
5
5
2 3 0 0 0 
0 1 0 0 0
1 1 1 0 0 
0 0 2 4 4
0 0 0 2 0
Sample Output
10

Sample Input
5
5
1 1 1 0 0 
0 1 0 0 0 
1 1 1 0 0 
0 0 0 0 0 
0 0 0 0 0
Sample Output
7

*/

package Raja_Software_Round2;

import java.util.Scanner;

public class A06_Hour_Glass_Problem {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int m = sc.nextInt();
		 int[][] arr = new int[n][m];
		 for (int i = 0; i < n; i++) {
			 for (int j = 0; j < m; j++) {
				 arr[i][j] = sc.nextInt();
			 }
		 } 
		 if( n < 3 || m < 3 ) {
			 return;
		 }
		 int maxSum = 0;
		 for(int i = 1; i < n-1; i++) {
			 for(int j = 1; j < m-1; j++) {
				 int sum = arr[i][j] + ( arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1] ) 
						 + ( arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1] );
				 maxSum = Math.max(maxSum, sum);
			 }
		 }
		 System.out.println(maxSum);
		 sc.close();
	}
}
