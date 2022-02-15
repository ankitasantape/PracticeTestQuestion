package Raja_Software_Labs_Round2_Questions;


public class A05_Sum_Of_Non_Prime_Numbers {

	public static void main(String[] args) {

		int[] arr = {2,4,5,7,3};
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			boolean isPrime = true;
			for(int div = 2; div * div <= arr[i]; div++) {
				if(arr[i] % div == 0) {
					isPrime = false;
					break;
				}
			}
			if( !isPrime ) {
				sum += arr[i];
			}
		}
		System.out.println(sum);

	}

}
