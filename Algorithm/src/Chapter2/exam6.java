package Chapter2;

import java.util.ArrayList;
import java.util.Scanner;

public class exam6 {
	public boolean isPrime(int num) {
		if(num==1) return false;
		boolean answer = true;
		for(int i =2; i<num; i++) {
			if(num%i==0) {
				answer = false;
			}
			
		}
		return answer;
	}
	
	public ArrayList<Integer> solution(int n,int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		for(int i =0;i<n; i++) {
			int tmp=arr[i];
			int res = 0;
			int t=0;
			while(tmp>0) {
				t=tmp%10;
				res = res*10 +t;
				tmp=tmp/10;
			}
			if(isPrime(res)) answer.add(res);
			 
		}
		
		return answer;
	}

	public static void main(String[] args) {
			exam6 T = new exam6();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i]=sc.nextInt();
		}
		for(int x : T.solution(N,arr)) {
			System.out.print(x+" ");
		}

	}

}
