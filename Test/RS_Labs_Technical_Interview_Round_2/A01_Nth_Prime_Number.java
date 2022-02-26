package RS_Labs_Technical_Interview_Round_2;

public class A01_Nth_Prime_Number {

	public static void main(String[] args) {
		int n= 5; // 7
		int ans = solution(n);
		System.out.println( ans );
	}

	private static int solution(int n) {
		if( n==1 ) {
			return 2;
		}
		if( n==2 ) {
			return 3;
		}
		int count = 0;
		for(int i=1; i > 0; i++) {
			
			boolean isPrime = true;
			for(int div=2; div*div <= i; div++) {
				if( i % div == 0 ) {
					isPrime = false;
					break;
				}
			}
			if( isPrime == true ) {
				count++;
			}
			if(count == n) {
				return i;
			}
		}
		return 0;
	}

}
