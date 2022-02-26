package RS_Labs_Technical_Interview_Round_1;

public class A03_Second_Largest_Without_Sorting {

	public static void main(String[] args) {
		 int[] arr = {3, 5, 7, 10, 14, 6}; // 10
	     int fmax = Integer.MIN_VALUE;
         int smax = Integer.MIN_VALUE;
         for(int i = 0; i < arr.length; i++){
              if( arr[i] > fmax ) {
                  smax = fmax;
                  fmax = arr[i];
              } else if( arr[i] > smax){
                   smax = arr[i];
              }					
         } 		  
	      System.out.println(smax);
   }

}
