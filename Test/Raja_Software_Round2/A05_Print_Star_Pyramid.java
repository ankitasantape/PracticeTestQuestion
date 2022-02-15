package Raja_Software_Round2;

public class A05_Print_Star_Pyramid {

	public static void main(String[] args) {
		int n = 7;
		int sp = n-1;
		int str = 1;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= str; j++) {
				System.out.print("*");
			}
			System.out.println();
			sp -= 1;
			str += 2;
		}
	}
}
/*
      *
     ***
    *****
   *******
  *********
 ***********
*************
 
*/
