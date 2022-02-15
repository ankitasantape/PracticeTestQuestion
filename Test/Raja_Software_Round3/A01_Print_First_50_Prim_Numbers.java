package Raja_Software_Round3;

public class A01_Print_First_50_Prim_Numbers {

	public static void main(String[] args) {
		int n = 50;
		int count = 0;
		for(int num = 2; num <= n; num++) {
			boolean flag = true;
			for(int div = 2; div * div <= num; div++) {
				if(num % div == 0) {
					flag = false;
					break;
				}
			}
			if(flag == true) {
			  count++;	
			  System.out.println(count + " -> " + num);
			}
		}
	}
}
/*
count -> prime number
1 -> 2
2 -> 3
3 -> 5
4 -> 7
5 -> 11
6 -> 13
7 -> 17
8 -> 19
9 -> 23
10 -> 29
11 -> 31
12 -> 37
13 -> 41
14 -> 43
15 -> 47

*/
