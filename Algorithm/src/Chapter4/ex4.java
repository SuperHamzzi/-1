package Chapter4;

import java.util.HashMap;
import java.util.Scanner;

public class ex4 {
	
	public int solution(String s,String t) {
		HashMap<Character,Integer> hm = new HashMap<>();
		HashMap<Character,Integer> hm2 = new HashMap<>();
		int answer =0;
		
		char[] ch = s.toCharArray();
		char[] ch2=t.toCharArray();
		int lt=0;
		for(int i =0; i<ch2.length;i++) {
			hm2.put(ch2[i],hm2.getOrDefault(ch2[i], 0)+1);
		}
		for(int i =0; i<ch2.length-1;i++) {
			hm.put(ch[i],hm.getOrDefault(ch[i], 0)+1);
		}
		for(int rt=ch2.length-1; rt<ch.length; rt++) {
			hm.put(ch[rt], hm.getOrDefault(ch[rt], 0)+1);
			if(hm.equals(hm2)) answer++;
			hm.put(ch[lt], hm.get(ch[rt])-1);
			if(hm.get(ch[lt])==0) hm.remove(ch[lt]);
			lt++;
		}
		
		
		return answer;
	}
	public static void main(String[] args) {
		ex4 T = new ex4();
		Scanner sc =new Scanner(System.in);
		String S = sc.next();
		String t = sc.next();
		System.out.println(T.solution(S,t));

	}

}
