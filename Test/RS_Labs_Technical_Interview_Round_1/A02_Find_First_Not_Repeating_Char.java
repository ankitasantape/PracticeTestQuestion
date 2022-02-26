package RS_Labs_Technical_Interview_Round_1;

import java.util.HashMap;

public class A02_Find_First_Not_Repeating_Char {

	public static void main(String[] args) {
//		String str = "amazon"; // ans: m 
		String str = "raja"; // ans: r
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if( map.containsKey(ch) ) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		for(int i = 0; i < str.length(); i++) {
			if( map.get( str.charAt(i) ) == 1 ) {
				System.out.println( str.charAt(i) );
				return;
			}
		}
	}

}
