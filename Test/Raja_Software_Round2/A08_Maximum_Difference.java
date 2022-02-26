package Raja_Software_Round2;

public class A08_Maximum_Difference {

	public static void main(String[] args) {
		int[] arr = {1, 10, 5, 2, 8, 1}; // 9
		int lsf = Integer.MAX_VALUE;
		int omaxdiff = 0;
		for(int i = 0; i < arr.length; i++) {
		   if( arr[i] < lsf ) {
			   lsf = arr[i];
		   }
		   int maxdiff = arr[i] - lsf;
		   if( maxdiff > omaxdiff ) {
			   omaxdiff = maxdiff;
		   }
		}
		System.out.println( omaxdiff );
		if( omaxdiff % 2 == 0 ) {
			System.out.println("EVEN");
		} else {
			System.out.println("ODD");
		}
	}

}
