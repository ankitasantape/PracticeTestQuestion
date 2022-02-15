/*
Sample Input
  geeksforgeeks
Sample Output
  f

*/

package Raja_Software_Round2;

import java.util.*;

public class A07_First_Non_Repeating_Character {

	public static class FreqIndex{
		int freq;
		int firstIdx;
		
		FreqIndex(int firstIdx){
			this.freq = 1;
			this.firstIdx = firstIdx;
		}
		// update frequency
		public void incCount() {
			this.freq++;
		}
	}
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String str = sc.next();
		 System.out.println( solution1(str) );
		 System.out.println( solution2(str) );
		 System.out.println( solution3(str) );
		 System.out.println( solution4(str) );
		 sc.close();
	}
    
	private static char solution3(String str) {
		
		return '\0';
	}

	static HashMap<Character, FreqIndex> map = new HashMap<>(256);
	public static void getCharCountArray(String str) {
		for( int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if( map.containsKey(ch) ) {
				map.get(ch).incCount();
			} else {
				map.put(ch, new FreqIndex(i));
			}
		}
	}
	
//	Time Complexity : O(n) Space Complexity: O(n)
    private static char solution4(String str) {
    	getCharCountArray(str);
    	int firstidx = Integer.MAX_VALUE;
    	for( Map.Entry<Character, FreqIndex> entry : map.entrySet()) {
    		
    		int freq = entry.getValue().freq;
    		int idx = entry.getValue().firstIdx;
    		if( freq == 1 && idx < firstidx ) {
    			firstidx = idx;
    		}
    	}
    	if( firstidx == Integer.MAX_VALUE) {
    		System.out.println("All characters are repeating.");
    		return '\0';
    	}
    	char ch = str.charAt(firstidx);
 		return ch;
	}

//	HashMap is slow as compare to array
//	
	private static char solution1(String str) {
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if( map.get(ch) == 1 ) {
				return ch;
			}
		}
		return '\0';
	}

	private static char solution2(String str) {
		 int n = str.length();
		 int[] freq = new int[26];
		 char ans = '\0';
		 for(int i = 0; i < n; i++) {
			 char ch = str.charAt(i);
			 freq[ ch - 'a'  ]++;
		 }
		 for(int i = 0; i < 26; i++) {
			if( freq[i] == 1 ) { 
//			  System.out.println( (char)(i + 'a')  + " "+ freq[i]);
			  ans = (char)(i + 'a');
			  break;
			}
		 }
		 return ans;
	}

}
