/*
/*
 Vikas gives Pepcoder two integers n and k, and asks him to count the number of
positive integer i's such that:

                         i*(n - i) ≤ n*k , i < n

Given q queries where each query consists of some n and k, print the number of
possible i's for each query on a new line.

Example
Input:
2
5 1
5 2

Output:
2
4

Explanation

Pepcoder performs the following q=2 queries:

The possible values of i satisfying the formula for n=5 and k=1 are 1 and 4.
Because there are two such values, we print 2 on a new line.

The possible values of i satisfying the formula for n=2 and k=2 are
1, 2, 3, and 4. Because there are four such values, we print 4 on a new line.
Input Format

The first line contains an integer, , denoting the number of times Vikas queries
Pepcoder.

Each of the  subsequent lines contains two space-separated integers denoting the
respective values of n and k for a query.
Constraints

1 ≤ q ≤ 10^5
1 ≤ n, k ≤ 10^9
Output Format

For each query, print the number of i's satisfying the given formula on a new line.

Sample Input 0

2
5 1
5 2
Sample Output 0

2
4
 
*/
package Test3;

import java.util.Scanner;

public class A02_Pepcoder_And_Counting {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++){
            long n = sc.nextInt();
            long k = sc.nextInt();
            solve(n, k);
        }
        sc.close();
    }
    
    public static void solve(long n, long k){
        if(n/2 * (n-n/2) <= n*k || n==1 ){
            System.out.println(n-1);
            return;
        }
        
        long left = 1, right = n/2;
        while( left < right){
            long mid = (left + right + 1)/2;
            if(mid*(n-mid) <= (n*k)){
                left = mid;
            } else {
                right = mid-1;
            }
        }
        long ans = 2 * left - (left + left == n ? 1  : 0);
        if(left > right){
            ans = 0;
        }
        System.out.println(ans);
    }

}
