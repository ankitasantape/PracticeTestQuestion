package Raja_Software_Round3;

import java.util.Scanner;

public class A02_Leap_Year {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 1999 -> Not a Leap Year
//		n = 2000; // Leap Year
//		n = 2024; // Leap Year
		if( n % 400 == 0 ) {
			System.out.println(n + " is Leap Year!");
		} else if( n % 100 == 0 ) {
			System.out.println(n + " is Not a Leap Year!");
		} else if( n % 4 == 0 ) {
			System.out.println(n + " is Leap Year!");
		} else {
			System.out.println(n + " is Not a Leap Year!");
		}
		sc.close();
	}

}
