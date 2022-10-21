package Chapter6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ex6 {
	public ArrayList<Integer> solution(int N,int[] arr) { 
		ArrayList<Integer> answer =new ArrayList<>();
		int[] tmp = arr.clone(); //기본 복사
		Arrays.sort(tmp);
		for(int i =0; i<N; i++) {
			if(arr[i]!=tmp[i]) {
				answer.add(i+1);
			}
		}
		
		return answer;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		ex6 T =new ex6();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<N;i++) arr[i]=sc.nextInt();
		for(int x : T.solution(N,arr)) System.out.print(x+" ");
		

	}

	}


