/*
1.Take as input String.
2.Take as input Integer "i" which I used to verify your return type String.

a. Write a recursive function which replace all ‘hi’ in the string with
   pep. Print the i'th index character.
b. Write a recursive function which removes all ‘hi’ in the string with
  "pep". Print the output (return type void).


Example(To be used only for expected output):

Input:
hihihijjhihi 1

output
e
peppeppepjjpeppep
Input Format

String representing S.

Constraints

Size of String may be large.

Output Format

print Output.

Sample Input 0

hihihijjhihi 1
Sample Output 0

e
peppeppepjjpeppep
*/

package Test3;

import java.util.Scanner;

public class A01_ReplaceString {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String []sarr = str.split(" ");
		str = sarr[0];
		int idx = Integer.parseInt(sarr[1]);
		str = str.replaceAll("hi", "pep");
		System.out.println(str.charAt(idx));
		System.out.println(str);
		sc.close();
	}
     
	public static void replaceAll(String str, String rstr) {
		
	}
}
