package Chapter5;

import java.util.Scanner;
import java.util.Stack;

public class ex1 {
	
	public String solution(String str) {
		String answer = "Yes";
		Stack<Character> st =new Stack<>();
		for(char x : str.toCharArray()) {
			if(x=='(') st.push(x);
			else {
				if(st.empty()) return "NO";
				st.pop();
			}
		}
		if(!st.isEmpty()) return "NO";
		
		
		
		return answer;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ex1 T = new ex1();
		String str = sc.next();
		System.out.println(T.solution(str));

	}

}
