/*
1.Take as input String.

A “twin” is defined as two instances of a char separated by a char.

Write a function which recursively counts number of “twins” in a string when
overlap is not allowed and Print the value returned.

Example(To be used only for expected output):

Input:
AxAxA

output
1
Input Format

String representing S.

Constraints

Size of String may be large.

Output Format

print Output.

Sample Input 0

AxAxA
Sample Output 0

1
*/
package Test3;

import java.util.HashMap;
import java.util.Scanner;

public class A03_Twin_Count_Without_Overlap {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		HashMap<Character, Integer> fmap = new HashMap<>();
		String ustr = "";
		for(char ch : str.toCharArray()) {
			if(fmap.containsKey(ch)) {
				fmap.put(ch, fmap.get(ch) + 1);
			} else {
				fmap.put(ch, 1);
				ustr += ch;
			}
		}
		
		twin_count(ustr, fmap);
		sc.close();
	}

	private static void twin_count(String str, HashMap<Character, Integer> fmap) {
		
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(fmap.get(str.charAt(i)) % 2 == 0) {
				count += fmap.get(str.charAt(i)) / 2;
			}
		}
		System.out.println(count);
	}
  
}
