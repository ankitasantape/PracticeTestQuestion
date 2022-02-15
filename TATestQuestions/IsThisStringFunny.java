package TAAssessment;

import java.util.Scanner;

public class IsThisStringFunny {

	public static void main(String[] args) {

/* 2
Sample Input  : acxz
Sample Output : Funny
Sample Input  : bcxz
Sample Output : Not Funny
*/
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
         ob.nextLine();
        
        for(int i=0;i<n;i++){
           
            String s = ob.nextLine();
            String result = funnyString(s);
            System.out.println(result);
        }
        
       // System.out.println(result);
        ob.close();

	}
    
    static String funnyString(String s){
     
    	String r = (new StringBuffer(s)).reverse().toString();
        for(int i=1;i<s.length();i++){
            if(Math.abs(((int)s.charAt(i))-((int)s.charAt(i-1))) != Math.abs(((int)r.charAt(i))-((int)r.charAt(i-1)))){
                return "Not Funny";
            }
        }
        return "Funny";
    }
}
