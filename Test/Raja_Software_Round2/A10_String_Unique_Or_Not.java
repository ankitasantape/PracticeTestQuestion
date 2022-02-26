package Raja_Software_Round2;

import java.util.Arrays;

public class A10_String_Unique_Or_Not {

	public static void main(String[] args) {
//		String str = "abcd10jk"; // true;
		String str = "hutg9mnd!nk9"; // false
		
		System.out.println( solution1(str) );
		System.out.println( solution2(str) );
		System.out.println( solution3(str) );
	}

	// O(N^2)
	private static boolean solution1(String str) {
		for(int i = 0; i < str.length(); i++) {
			for(int j = i+1; j < str.length(); j++) {
				if( str.charAt(i) == str.charAt(j) ) {
					return false;
				}
			}
		}
		return true;
	}
	// O(N log N)
    private static boolean solution2(String str) {
		char[] chArray = str.toCharArray();
		Arrays.sort(chArray);
		
		for(int i = 0; i < chArray.length-1; i++) {
			if( chArray[i] == chArray[i+1] ) {
				return false;
			}
		}
		return true;
	}
    // O(N)
    private static boolean solution3(String str) {
	    boolean[] chArray = new boolean[256];
	    Arrays.fill(chArray, false);
	    if( str.length() > chArray.length ) {
	    	return false;
	    }
	    for(int i = 0; i < str.length(); i++) {
	    	char ch = str.charAt(i);
	    	int chidx = (int) ch;
	    	if( chArray[chidx] == true ) {
	    		return false;
	    	}
	    	chArray[chidx] = true;
	    }
	    return true;
    }
    
    
    
    /*
     Approach 3 – Use of Extra Data Structure: This approach assumes ASCII char set(8 bits). The idea is to maintain a boolean array for the characters. The 256 indices represent 256 characters. All the array elements are initially set to false. As we iterate over the string, set true at the index equal to the int value of the character. If at any time, we encounter that the array value is already true, it means the character with that int value is repeated. 
     
     */    

}
