/*
Write a function that takes a string as input and replace the space with “%?”

Input: "welcome to geeksforgeeks"
Output: "welcome%?to%?geeksforgeeks"
You have to make changes in the given string only.

*/

package Raja_Software_Round2;

public class A13_Replace_Spaces_With_Symbol {

	public static void main(String[] args) {
		String str = "welcome  to geeksforgeeks";
		int len = getLength(str); 
//		System.out.println(len);
		int i;
		int si = 0;
		String[] strarr = new String[len];
		int ai = 0;
		for( i = 0; i < str.length(); i++) {
			if( str.charAt(i) == '\040') {
				strarr[ai++] = str.substring(si, i);
				si = i+1;	
			}
		}
		strarr[ai] = str.substring(si, i);
		String ansstr = "";
		for( i = 0; i < strarr.length; i++) {
			ansstr += strarr[i] + "%?";
		}
		System.out.println( ansstr.substring(0, ansstr.length()-2) );
	}

	private static int getLength(String str) {
		int len = 0;
		for(int i = 0; i < str.length(); i++) {
			if( str.charAt(i) == '\040' ) {
				len++;
			}
		}
		return len+1;
	}

}
