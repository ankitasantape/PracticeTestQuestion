package Raja_Software_Labs_Round2_Questions;

public class A03_Reverse_Alternate_String {

	public static void main(String[] args) {
		String str = "I.like.programming.very.much"; //output: I.ekil.programming.yrev.much
		System.out.println( reverseAlternateString1(str) );
		System.out.println( reverseAlternateString2(str) );
	}
	public static String reverseAlternateString1(String str) {
       String[] strarr = str.split("[.]");  
		
		int n = strarr.length;
		for (int i = 1; i < n; i+=2) { // O(N)
			String s = strarr[i];
			String revstr = reverse(s); // O(N)
		    strarr[i] = revstr;			
		}
		
		String ansstr = "";
		for (int i = 0; i < n-1; i++) {
			ansstr += strarr[i] + ".";
		}
		ansstr += strarr[n-1];
		return (ansstr);
	}
	
    private static String reverseAlternateString2(String str) {
    	String[] strarr = str.split("[.]", 0);  
 		
 		int n = strarr.length;
 		StringBuilder sb;
 		for (int i = 1; i < n; i+=2) { // O(N)
 			sb = new StringBuilder();
 			sb.append(strarr[i]).reverse();
 		    strarr[i] = sb.toString();	
 		}
 		
 		String ansstr = "";
 		for (int i = 0; i < n-1; i++) {
 			ansstr += strarr[i] + ".";
 		}
 		ansstr += strarr[n-1];
 		return (ansstr);
		
	}
	
	public static String reverse(String s) {
		String revstr = "";
		for (int j = s.length()-1; j >= 0; j--) { // O(N)
			revstr += s.charAt(j);
		}
		return revstr;
	}

}
