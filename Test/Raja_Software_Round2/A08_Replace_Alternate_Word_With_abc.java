/*
Avoid using inbuilt functions
Input: "i.like.this.program.very.much"
Output: "i.abc.this.abc.very.abc"

*/

package Raja_Software_Round2;

public class A08_Replace_Alternate_Word_With_abc {

	public static void main(String[] args) {
		String str = "i.like.this.program.very.much";
		int len = getLength(str);
		String[] strarr = new String[len];
		int l = 0;
		int j = 0;
		int i;
		for(i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if( ch == '.' ) {
				String s = str.substring(j, i);
				strarr[l++] = s;
				j = i+1;
			}
		}
		strarr[l] = str.substring(j, i);
//		for(i = 0; i < strarr.length; i++) {
//			System.out.print( strarr[i] + " ");
//		}
		
		String ansstr = "";
		for(i = 0; i < strarr.length; i++) {
			if( i % 2 != 0 ) {
				ansstr += "abc";
			} else {
				ansstr += strarr[i];
			}
			ansstr += ".";
		}
		System.out.println(ansstr.substring(0, ansstr.length()-1));
	}

	private static int getLength(String str) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if( str.charAt(i) == '.' ) {
				count++;
			}
		}
		return count + 1;
	}

}
