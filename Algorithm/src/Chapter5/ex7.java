package Chapter5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ex7 {
	public String solution(String need,String plan) {
		String answer= "YES";
		Queue<Character> q = new LinkedList<>();
		for(char x:need.toCharArray()) {
			q.offer(x);
		}
		
		for(char x: plan.toCharArray()) {
			if(q.contains(x)) {
				if(x != q.poll()) return "NO";
			}
		}
		if(!q.isEmpty()) {
			return "NO";
		}
		
		
		
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ex7 T = new ex7();
		String n = sc.next();
		String m = sc.next();
		System.out.println(T.solution(n,m));

	}

}
