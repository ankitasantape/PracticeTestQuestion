package Raja_Software_Labs_Round2_Questions;

public class A03_Reverse_Alternate_String {

	public static void main(String[] args) {
		String str = "I.like.programming.very.much"; //output: I.ekil.programming.yrev.much
		String[] strarr = str.split("[.]", 0);  
		
		int n = strarr.length;
		for(int i = 0; i < n; i++) {
			System.out.println(strarr[i]);
		}
		for(int i = 1; i < n; i+=2) {
			String s = strarr[i];
			String revstr = "";
			
			for(int j = s.length()-1; j >= 0; j--) {
				revstr += s.charAt(j);
			}
		    strarr[i] = revstr;			
		}
		String ansstr = "";
		for(int i = 0; i < n-1; i++) {
			ansstr += strarr[i] + ".";
		}
		ansstr += strarr[n-1];
		System.out.println(ansstr);
	}

}
