/*
print the frequency of char b, f, j, t, v if presents
print the count of frequency of chars except above chars

Sample Input
rajasoftwarelabs
Sample Output
b=1, f=1, j=1, t=1, others=12

Sample Input
Buffet
Sample Output
b=1, f=2, t=1 others=2 

*/

package Raja_Software_Labs_Round2_Questions;

import java.util.*;

public class A01_Count_The_Frequency_Of_Given_Char_And_Others {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "rajasoftwarelabs"; // b=1, f=1, j=1, t=1, others=12 

		int count = 0;
		str.toLowerCase();
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if( ch == 'b' || ch == 'f' || ch == 'j' || ch == 't' ) {
				System.out.print( ch + "=" + map.get(ch) + ", ");
			} else {
				count++;
			}
		}
		System.out.println("others=" + count);
		sc.close();
	}

}
