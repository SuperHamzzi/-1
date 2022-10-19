package Chapter6;

import java.util.Scanner;

public class ex1_2 {
	public int[] solution(int n, int[] arr) {
		for(int i=0; i<n-1; i++) {
			int idx=i;
			for(int j=i+1; j<n; j++) {
				if(arr[j]<arr[idx]) idx=j;
			}
			int tmp=arr[i];
			arr[i]= arr[idx];
			arr[idx] =tmp;
		}
		
		return arr;
	}
	
	

	public static void main(String[] args) {
		ex1_2 T = new ex1_2();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr =new int[n];
		for(int i =0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		for(int x: T.solution(n,arr)) System.out.print(x+" ");

	}

}
