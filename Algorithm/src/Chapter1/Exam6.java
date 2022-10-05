
package Chapter1;

import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		Exam6 T = new Exam6();
		Scanner sc =new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));

	}

	private String solution(String str) {
		String answer ="";
		
		
		for(int i=0;i<str.length();i++) {
			if(i==str.indexOf(str.charAt(i))){
				answer += str.charAt(i);
					
				
			}
		}
		
		return answer;
	}

}
