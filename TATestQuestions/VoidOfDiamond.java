package TAAssessment;

import java.util.Scanner;
/* Void of diamond
Level HARD
Print the following pattern for the given number of rows.
Pattern for N = 5
*****
** **
*   *
** **
*****
Input format : N (Total no. of rows and N can only be odd)

Output format : Pattern in N lines

Sample Input :
9
Sample Output :
*********
**** ****
***   ***
**     **
*       *
**     **
***   ***
**** ****
*********
**/
public class VoidOfDiamond {
    public static void main(String[] args) {
	
    	Scanner s = new Scanner(System.in);
    	
    	int n = s.nextInt();
    	print(n);
    	
    	s.close();
	}

	public static void print(int n) {
		int i, j;
		for( i = -n/2; i <= n/2; i++ ) {
			for( j = -n/2; j <= n/2; j++ ) {
				if( Math.abs(i) + Math.abs(j) < n/2 )
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
