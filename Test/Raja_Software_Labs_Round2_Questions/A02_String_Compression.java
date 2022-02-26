package Raja_Software_Labs_Round2_Questions;

public class A02_String_Compression {

	public static void main(String[] args) {
		String str = "aaabbbbbccccdeeeefgggg"; // a3b5c4de4fg4
		
		String ansstr = str.charAt(0) + "";
		int count = 1;
		// Time Complexity : O(N)
		for(int i = 1; i < str.length(); i++) {
			char currchar = str.charAt(i);
			char prevchar = str.charAt(i - 1);
			if(currchar == prevchar) {
				count++;
			} else {
				if(count > 1) {
					ansstr += count;
					count = 1;
				} 
				ansstr += currchar; 
			}
		}
		if(count > 1) {
			ansstr += count;
		}
		System.out.println(ansstr);
	}

}
