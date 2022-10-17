package Chapter4;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class ex5 {
	
	public int solution(int n,int k,int[] arr) {
		int answer = -1;
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
		for(int i =0; i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				for(int z=j+1;z<arr.length;z++) {
					Tset.add(arr[i]+arr[j]+arr[z]);
					}
				}
			}
		int cnt=0;
		for(int x: Tset) {
			cnt++;
			if(cnt==k) return x;
		}
		
		
		
		
		return answer;
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
			ex5 T =new ex5();
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[] arr = new int[N]; 
			for(int i =0; i<N; i++) {
				arr[i] =sc.nextInt();
			}
			System.out.println(T.solution(N,K,arr));
	
	
	
	}
}
