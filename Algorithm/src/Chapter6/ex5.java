package Chapter6;

import java.util.Arrays;
import java.util.Scanner;

public class ex5 {
	public String solution(int N,int[] arr) {
		String answer ="U";
		Arrays.sort(arr);
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]==arr[i+1]) return "D";
			}
		
		
		
	return answer;
	}
		
	
	

	public static void main(String[] args) {
			ex5 T =new ex5();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<N;i++) arr[i]=sc.nextInt();
		System.out.println(T.solution(N,arr));
		

	}

}
