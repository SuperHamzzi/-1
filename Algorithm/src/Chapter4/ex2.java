package Chapter4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class ex2 {
	
	public String solution(String str1,String str2) {
		String answer ="YES";
		HashMap<Character,Integer> hm = new HashMap<>();
		for(char x:str1.toCharArray()) {
			hm.put(x, hm.getOrDefault(x,0)+1);
		}
		for(char x: str2.toCharArray()) {
			if(!hm.containsKey(x) || hm.get(x)==0) return"NO";
			hm.put(x,hm.get(x)-1);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		ex2 T = new ex2();
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next().toUpperCase();
		String str2 = sc.next().toUpperCase();
		System.out.println(T.solution(str1,str2));
	}

}
