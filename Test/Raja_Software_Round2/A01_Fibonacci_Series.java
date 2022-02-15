package Raja_Software_Round2;

import java.util.Scanner;

public class A01_Fibonacci_Series {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		for(int i = 1; i <= n; i++) {
			System.out.println(a);
			int c = a + b;
			a = b;
			b = c;
		}
		System.out.println( solution1(n) );
		sc.close();
	}

	private static int solution1(int n) {
		
		return 0;
	}
	
	

}

/*
Sample Input
10
Sample Output
0
1
1
2
3
5
8
13
21
34 
 */
 