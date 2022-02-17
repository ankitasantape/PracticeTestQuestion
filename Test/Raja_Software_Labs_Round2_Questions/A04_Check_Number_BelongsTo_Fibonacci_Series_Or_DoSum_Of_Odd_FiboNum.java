/*
   If number is fibonacci number then return number
   If number is not fibonacci number then return the sum of odd fibonacci number should be less than the number
     
*/
package Raja_Software_Labs_Round2_Questions;

public class A04_Check_Number_BelongsTo_Fibonacci_Series_Or_DoSum_Of_Odd_FiboNum {

	public static void main(String[] args) {
		
		System.out.println(getFiboCount(20)); // 23
		System.out.println(getFiboCount(21)); // 21 is a fibonacci number
		System.out.println(getFiboCount(23)); // 44
		
		  int n = 7;
		  int a = 0;
		  int b = 1;
		  int c = a + b;
		  int sum = 1;
		  while( c < n ) {
			  if(c % 2 != 0) {
				  sum += c;
			  }
			  a = b;
			  b = c;
			  c = a + b;
		  }
		  System.out.println(sum); // output: 10
		
		  int n1 = 7;
		  int a1 = 0;
		  int b1 = 1;
		  int c1 = a1 + b1;
		  int sum1 = 0;
		  while( b1 < n ) {
			  if(b1 % 2 != 0) {
				  sum1 += b1;
			  }
			  a1 = b1;
			  b1 = c1;
			  c1 = a1 + b1;
		  }
		  System.out.println(sum1); // output: 10
	}
	
	public static int getFiboCount(int n) {
		boolean isFibo = isPerfectSquare(5*n*n + 4) || isPerfectSquare(5*n*n - 4);
		int sum = 0;
		if(isFibo == true) {
			return n;
		} else {
			int a = 0; 
			int b = 1;
			for(int i = 2; i < n && b < n ; i++) {
				if(b % 2 != 0) {
					sum += b;
				}
				int c = a + b;
				a = b;
				b = c;
			}
		}
		return sum;
	}

	private static boolean isPerfectSquare(int n) {
		int x = (int) Math.sqrt(n);
		return (x*x == n);
	}

}
