package TAAssessment;
/**/
import java.util.Arrays;
import java.util.Scanner;

public class OfferAtBookStore {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int sizeofarray=scn.nextInt();
		int[] array=new int[sizeofarray];
		
		for(int i=0; i<sizeofarray; i++) {
			array[i]=scn.nextInt();
		}
		
		Arrays.sort(array);
		long sum =0;
		for(int i=0; i<sizeofarray; i++) {
			sum+=array[i];
		}
		
		for(int i=array.length-3; i>=0; i-=3) {
			sum-=array[i];
		}
		
		System.out.println(sum);
        scn.close();
	}
}
