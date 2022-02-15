package Raja_Software_Round2;

public class A03_Count_Vowel_In_String {

	public static void main(String[] args) {
		String str = "iamasoftwaredeveloper";
		int vcount = 0;
		int conscount = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
				vcount++;
			} else {
				conscount++;
			}
		}
		System.out.println(vcount); // 10
		System.out.println(conscount); // 11
		System.out.println(vcount + conscount + " " + str.length()); // 21
	}

}
