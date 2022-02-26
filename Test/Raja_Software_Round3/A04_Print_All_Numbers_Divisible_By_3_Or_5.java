/*
3)Print all numbers between 0 to 10, 000 which are either divisible by 3 or by 5.

4)Extension to 3rd question
if number divisible by 3 and 5 the print Raja Software
if number is divisible by 3 then print Raja
if number is divisible by 5 then print Software

*/

package Raja_Software_Round3;

public class A04_Print_All_Numbers_Divisible_By_3_Or_5 {

	public static void main(String[] args) {
		int n = 10000;
		int count = 1;
		for(int num = 0; num < n; num++) {
			if( num % 3 == 0 && num % 5 == 0 ) {
				System.out.println((count++) + ". num = "+num);
			}
		}
		
		for(int num = 0; num < n; num++) {
			if( num % 3 == 0 && num % 5 == 0 ) {
				System.out.println("Raja Software");
			} else if(num % 3 == 0) {
				System.out.println("Raja");
			} else if(num % 5 == 0){
				System.out.println("Software");
			}
		}
	}

}
