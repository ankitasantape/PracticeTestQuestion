/*
Write a function that takes two inputs, year, and n and returns n leap year after the given year.

Input: year = 1, n=4
Output: 4,8,12,16
 
*/

package Raja_Software_Round2;

public class A12_Print_Next_N_Leap_Year {

	public static void main(String[] args) {
		int year = 1;
		int n = 4;
		int count = 0;
		while( count != n ) {
			year = year + 1;
			if(( year % 4 == 0) || ((year % 400 == 0) && (year % 100 != 0) )) {
				count++;
				System.out.print(year + " ");
			}
		}
	}

}
