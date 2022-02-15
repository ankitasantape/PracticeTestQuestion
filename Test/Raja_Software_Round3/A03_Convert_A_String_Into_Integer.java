package Raja_Software_Round3;

public class A03_Convert_A_String_Into_Integer {

	public static void main(String[] args) {
		String str = "1234598993940";
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int digit = ch - '0';
			System.out.print(digit + " ");
		}
	}
}

/* 
Sample Input
1234598993940
Sample Output
1 2 3 4 5 9 8 9 9 3 9 4 0 
*/
 