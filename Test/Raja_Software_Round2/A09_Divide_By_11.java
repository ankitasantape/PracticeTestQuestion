package Raja_Software_Round2;

public class A09_Divide_By_11 {

	public static void main(String[] args) {
		String str = "256";
		int num = 0;
		num = (int)str.charAt(0); 
		for(int i = 1; i < str.length(); i++) {
		
			
			 int b = str.charAt(i);
			 num += (num*10 + b) % 11;
			 
		}
		System.out.println(num);
	}

}
