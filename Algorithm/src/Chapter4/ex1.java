package Chapter4;

import java.util.HashMap;
import java.util.Scanner;

public class ex1 {
	public char solution(int n,String m) {
		char answer=' ';
		HashMap<Character,Integer> arr = new HashMap<>();
		for(char x :m.toCharArray()) {
			arr.put(x,arr.getOrDefault(x,0)+1);
				
		}
		int max=Integer.MIN_VALUE;
		for(char key:arr.keySet()) {
			//System.out.println(x+" "+arr.get(x));
			if(arr.get(key)>max) {
				max=arr.get(key);
				answer=key;
			}
		}
		
		return answer;
	}
	
	
	
	public static void main(String[] args) {
		ex1 T = new ex1();
		Scanner sc =new Scanner(System.in);
		 int N = sc.nextInt();
		String M = sc.next();
		 System.out.println(T.solution(N,M));
	}
}
