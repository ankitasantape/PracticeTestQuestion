/*
Write a function that takes input an integer number and prints the closest prime integer to that number. The closest prime can be greater or smaller than the passed input integer. If there are equi-distant prime-numbers, print both.
"32": Closest prime number is "31", so print "31"
"30": Closest prime numbers are "29" and “31”, so print both


*/
package RS_Labs_Technical_Interview_Round_1;

import java.util.Scanner;

public class A01_Nearest_Prime {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int leftdist = 0;
			int rightdist = 0;
			int smallerNearestPrime = 0;
			int greaterNearestPrime = 0;
			int i = n;
			while( i++ > 0 ) {
				if( isPrime( i ) ) {
					rightdist = i - n;
					greaterNearestPrime = i;
					break;
				}
			}
			i = n;
			while( i-- > 0 ) {
				if( isPrime( i ) ) {
					leftdist = n - i;
					smallerNearestPrime = i;
					break;
				}
			}
			if( leftdist < rightdist ) {
				System.out.println("Closest prime number is " + smallerNearestPrime);
			} else if( rightdist < leftdist ) {
				System.out.println("Closest prime number is " + greaterNearestPrime);
			} else {
				System.out.println( "Closest prime numbers are " + smallerNearestPrime + " and " + greaterNearestPrime);
			}
			
			sc.close();
		}
		
		public static boolean isPrime(int n) {
			for(int div = 2; div * div <= n; div++) {
				if( n % div == 0 ) {
					return false;
				}
			}
			return true;
		}
}
