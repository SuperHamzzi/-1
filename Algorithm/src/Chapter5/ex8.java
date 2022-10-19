package Chapter5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ex8 {
	
	public String solution(String str1,String str2) {
		String answer = "YES";
		Queue<Character> qu = new LinkedList<>();
		for(char x: str1.toCharArray()) {
			qu.offer(x);
		}
		for(char x:str2.toCharArray()) {
			if(qu.contains(x)) {
				if(x!=qu.poll()) {
					return "NO";
				}
			}
		}
		if(!qu.isEmpty()) return "NO";
		return answer;
	}

	public static void main(String[] args) {
		 ex8 T = new ex8();
		 Scanner sc = new Scanner(System.in);
		 String s=  sc.next();
		 String s2 = sc.next();
		 System.out.println(T.solution(s,s2));

	}

}
