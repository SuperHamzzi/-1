package Chapter3;

import java.util.Scanner;

public class ex4 {
	
	public int solution(int n, int m, int[] a) {
		int answer = 0;
		int sum = 0,lt=0;
		for(int rt=0; rt<n; rt++) {
			sum+=a[rt];
			if(sum==m) answer++;
			while(sum>=m) {
				sum-=a[lt++];
				if(sum==m) answer++;
					}
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		ex4 T =new ex4();
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int[] a = new int[N];
		for(int i=0; i<N; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(T.solution(N,M,a));

	}



}
