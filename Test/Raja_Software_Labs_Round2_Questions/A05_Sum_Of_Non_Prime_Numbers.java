package Raja_Software_Labs_Round2_Questions;


public class A05_Sum_Of_Non_Prime_Numbers {

	public static void main(String[] args) {

		int[] arr = {2,4,5,7,3};
		
        System.out.println( solution1(arr) );
	}

	private static int solution1(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			boolean isPrime = isPrime(arr[i]);
			if( !isPrime ) {
				sum += arr[i];
			}
		}
		return sum;
	}
	
	public static boolean isPrime(int n) {
		for(int div = 2; div * div <= n; div++) {
			if(n % div == 0) {
				return false;
			}
		}
		return true;
	}

}
