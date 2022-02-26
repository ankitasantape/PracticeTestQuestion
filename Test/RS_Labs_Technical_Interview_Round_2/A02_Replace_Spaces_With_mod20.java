package RS_Labs_Technical_Interview_Round_2;

public class A02_Replace_Spaces_With_mod20 {

	public static void main(String[] args) {
		String str = "hwushudshu 98e9899w0 jijjdji ";  //output: hwushudshu%2098e9899w0%20jijjdji%20
		String ans = "";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == '\040') {
				ans += "%20";
			} else {
				ans += ch + "";
			}
		}
		System.out.println(ans);
	}

}
