package Raja_Software_Round2;

import java.util.Arrays;

public class A11_Second_Largest_In_Array {

	public static void main(String[] args) {
		int[] arr = {1,4,2,3,5,7,6};
		System.out.println( solution1(arr) );
		System.out.println( solution2(arr) );
	}

	// TC: O(n log n)
	private static int solution1(int[] arr) {
		Arrays.sort(arr);
		
		return arr[arr.length - 2];
	}

	// TC: O(n)
	private static int solution2(int[] arr) {
		int fmax = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			if( arr[i] > fmax ) {
				smax = fmax;
				fmax = arr[i];
			} else if( arr[i] > smax){
				smax = arr[i];
			}
		}
		return smax;
	}

}
