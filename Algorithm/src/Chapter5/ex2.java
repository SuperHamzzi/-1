package Chapter5;

import java.util.Scanner;
import java.util.Stack;

public class ex2 {
	public String solution(String s) {
		String answer="";
		Stack<Character> st = new Stack<>();
		for(char x : s.toCharArray()) {
			if(x==')') {
				while(st.pop()!='(') {
					
				}
				}
			else st.push(x);
		}
		for(int i=0; i<st.size(); i++) {
			answer+=st.get(i);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ex2 T = new ex2();
		String N = sc.next();
		System.out.println(T.solution(N));
	}

}

