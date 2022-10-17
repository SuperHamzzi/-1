package Chapter5;

import java.util.Scanner;
import java.util.Stack;

public class ex4 {
	public int solution(String str) {
		Stack<Integer> st = new Stack<>();
		int answer=  0;
		for(char x:str.toCharArray()) {
			if(Character.isDigit(x)) {
				st.push(x-48);
			}else {
				int rt = st.pop();
				int lt = st.pop();
				if(x=='+') st.push(lt+rt);
				else if(x=='-') st.push(lt-rt);
				else if(x=='*') st.push(lt*rt);
				else if (x=='/') st.push(lt/rt);
			}
		}
		
		
		answer =st.get(0);
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ex4 T = new ex4();
		String str = sc.next();
		System.out.println(T.solution(str));
	}

}
