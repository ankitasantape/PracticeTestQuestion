package Raja_Software_Round4;

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
