package Chapter5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ex6 {
	
	public int solution(int n,int m) {
		int answer= 0;
		Queue<Integer> qu = new LinkedList<>();
		
		for(int i=1; i<=n; i++) {
			qu.offer(i);
		}
		while(!qu.isEmpty()) {
			for(int i=1; i<m; i++) {
				qu.offer(qu.poll());
			}
				qu.poll();
			if(qu.size()==1) answer =qu.poll();
			}
		
		
		
		return answer;
		
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		ex6 T = new ex6();
		int N = sc.nextInt();
		int M = sc.nextInt();
		System.out.println(T.solution(N,M));

	}

}
