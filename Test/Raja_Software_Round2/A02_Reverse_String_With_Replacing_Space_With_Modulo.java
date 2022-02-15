package Raja_Software_Round2;

//import java.util.Scanner;

public class A02_Reverse_String_With_Replacing_Space_With_Modulo {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		String str = "I am a software developer";
		// output1 : repoleved%erawtfos%a%ma%I
		// output2 : developer%software%a%am%I
		
		String ans = "";
		for(int i = str.length()-1; i >= 0; i--) {
			char ch = str.charAt(i);
			if ( ch == ' ' ) {
				ans += "%";
			} else {
				ans += ch;
			}
		}
		System.out.println(ans);
		
		String ans2 = "";
		String strarr[] = str.split(" ");
		for(int i = strarr.length-1; i > 0; i--) {
			ans2 += strarr[i] + "%";
		}
		ans2 += strarr[0];
		System.out.println(ans2);
	}
}
