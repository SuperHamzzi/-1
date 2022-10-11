package Chapter3;

import java.util.Scanner;

public class Main {
	
	public int solution(int n, int m, int[] a) {
		int sum =0,answer=0;
		for(int i=0; i<n;i++) {
			if(sum>m) {
			if(sum==m) {
				sum += a[i];
				answer++;
			}
			}
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		Main T =new Main();
		Scanner sc = new Scanner(System.in);
		int N=8;
		int M=6;
		int[] a = new int[N];
		for(int i=0; i<N; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(T.solution(N,M,a));

	}



}
