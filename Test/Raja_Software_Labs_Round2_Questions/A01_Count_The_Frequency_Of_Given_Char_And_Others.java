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
		String str = "rajasoftwarelabbs"; // b=1, f=1, j=1, t=1, others=12 
        solution1(str); // j=1, f=1, t=1, b=2, b=2, others=12
        solution2(str); // j=1, f=1, t=1, b=2, FreqCount Of others=28, Count of others=12
        solution3(str); // j=1, f=1, t=1, b=2, others=12
		sc.close();
	}
	// my code written in srl test
	public static void solution1(String str) {
		int count = 0;
		str.toLowerCase(); // Time : O(N)
		HashMap<Character, Integer> map = new HashMap<>(); // Space: O(256) 
		for(int i = 0; i < str.length(); i++) { // O(N)
			char ch = str.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0) + 1); // O(1)
		}
		for(int i = 0; i < str.length(); i++) { // O(N)
			char ch = str.charAt(i);
			if( ch == 'b' || ch == 'f' || ch == 'j' || ch == 't' ) { // O(1)
				System.out.print( ch + "=" + map.get(ch) + ", ");
			} else {
				count++; // O(1)
			}
		}
		System.out.println("others=" + count);
	}
	
	private static void solution2(String str) {
		int[] freq = new int[26]; // Space: O(26)
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			freq[ch - 'a']++;
		}
		int freqcount = 0;
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			 char ch = str.charAt(i);
			 if( ch == 'b' || ch == 'f' || ch == 'j' || ch == 't' ) {
				  if( freq[ch - 'a'] == -1 ) {
					  continue;
				  }
				  System.out.print(ch + "=" + freq[ch - 'a'] + ", ");
				  freq[ch - 'a'] = -1;
			 } else {
				 freqcount += freq[ch - 'a'];
				 count++;
			 }
		}
		System.out.println("FreqCount Of others="+freqcount + ", Count of others="+ count);
	}

	
	private static void solution3(String str) {
		int count = 0;
		str.toLowerCase(); // Time : O(N)
		HashMap<Character, Integer> map = new HashMap<>(); // Space: O(256) 
		for(int i = 0; i < str.length(); i++) { // O(N)
			char ch = str.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0) + 1); // O(1)
		}
		for(int i = 0; i < str.length(); i++) { // O(N)
			char ch = str.charAt(i);
			if( ch == 'b' || ch == 'f' || ch == 'j' || ch == 't' ) { // O(1)
				if( map.containsKey(ch) && map.get(ch) == -1 ) {
					continue;
				}
				System.out.print( ch + "=" + map.get(ch) + ", ");
				map.put(ch, -1);
			} else {
				count++; // O(1)
			}
		}
		System.out.println("others=" + count);
	}
}
