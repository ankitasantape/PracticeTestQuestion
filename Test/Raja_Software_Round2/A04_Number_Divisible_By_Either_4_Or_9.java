package Raja_Software_Round2;

public class A04_Number_Divisible_By_Either_4_Or_9 {

	public static void main(String[] args) {
		int[] arr = {2,5,23,54,67,81,35,46, 66, 88, 124, 345, 90, 78, 156, 198};
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			if ( arr[i] % 4 == 0 || arr[i] % 9 == 0 ) {
				System.out.println(arr[i]);
			}
		}
	}
}
/*
 
54
81
88
124
90
156
198
 
 */
