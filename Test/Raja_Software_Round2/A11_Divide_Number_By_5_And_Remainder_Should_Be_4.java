/*
Write a function that takes an array of integers and prints the numbers that have a remainder of 4 when divided by 5.

Input: [19,10,44,3,11,129]
Output: [19, 44, 129]
Input:[13,4]
Output: [4]

*/

package Raja_Software_Round2;

public class A11_Divide_Number_By_5_And_Remainder_Should_Be_4 {

	public static void main(String[] args) {
//		int[] arr = {19, 10, 44, 3, 11, 129};
		int[] arr = {13, 4};
		for(int i = 0; i < arr.length; i++) {
			if( arr[i] % 5 == 4 ) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
