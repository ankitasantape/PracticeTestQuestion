package Raja_Software_Round2;

public class A10_Second_Maximum_Difference {

	public static void main(String[] args) {
		int[] arr = {14, 12, 70, 95, 65, 22, 30};
		
		int least = arr[0];
		int sleast = arr[0];
		int smaxdiff = Integer.MIN_VALUE;
		int fmaxdiff = Integer.MIN_VALUE;
		
		for(int i = 1; i < arr.length; i++) {
			if( arr[i] < least ) {
				least = arr[i];
			} else if(arr[i] < sleast){
				sleast = arr[i];
			}
			
			int diff = arr[i] - sleast;

			if( diff > smaxdiff ) {
				smaxdiff = diff;
			}
		}
		System.out.println("Second Maximum = "+ smaxdiff);
		
		
		for(int i = 1; i < arr.length; i++) {
			if( arr[i] < least ) {
				least = arr[i];
			} else if(arr[i] < sleast){
				sleast = arr[i];
			}
			
			int diff = arr[i] - least;

			if( diff > fmaxdiff ) {
				fmaxdiff = diff;
			}
		}
		System.out.println("First Maximum = "+ fmaxdiff);
	}

}
