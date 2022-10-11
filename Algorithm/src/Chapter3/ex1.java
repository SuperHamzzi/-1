package Chapter3;

import java.util.ArrayList;
import java.util.Scanner;

public class ex1 {
	private ArrayList<Integer> soultion(int n, int m, int[] arr, int[] arr2) {
		ArrayList<Integer> answer = new ArrayList<>();
		int a = 0,b =0; //a와 b로 1개씩 증가하며 값비교
		while(a<n && b<m) {
			if(arr[a]<arr2[b]) answer.add(arr[a++]);
			else answer.add(arr2[b++]);
		}
		while(a<n) answer.add(arr[a++]);
		while(b<m) answer.add(arr2[b++]);
		return answer;
	}
		
		
		
	
	
	public static void main(String[] args) {
		ex1 T = new ex1();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i]=sc.nextInt();
		}
		int M = sc.nextInt();
		int [] arr2 = new int[M];
		for(int i=0; i<M; i++) {
			arr2[i]=sc.nextInt();
		}
		for(int x :T.soultion(N, M, arr, arr2)) {
			System.out.print(x+" ");
		}
		
		 
		
		
	}



	

}
