package Chapter5;

import java.util.Scanner;
import java.util.Stack;

public class ex3 {
	public int solution(int[][] arr1,int[] arr2) {
		int answer= 0;
		Stack<Integer> st = new Stack<>();
		for(int x : arr2) {
			for(int i=0; i<arr1.length;i++) {
				if(arr1[i][x-1]!= 0) {
					int tmp=arr1[i][x-1];
					arr1[i][x-1]=0;
				
				if(!st.isEmpty() && tmp==st.peek()) {
						answer+=2;
						st.pop();
				}
				else st.push(tmp);
				break;
				}
			}
		}
		
		
		
		
		return answer;
	}

	public static void main(String[] args) {
		ex3 T = new ex3();
		Scanner sc = new Scanner(System.in);
		int N = sc .nextInt();
		int[][] arr1 = new int[N][N];
		for(int i=0;i<N;i++) { 
			for(int j=0;j<N;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		int M  =sc.nextInt();
		int[] arr2 = new int[M];
		for(int i=0;i<M;i++) {
			arr2[i] = sc.nextInt();
		}
		System.out.println(T.solution(arr1,arr2));
		
		

	}

}
