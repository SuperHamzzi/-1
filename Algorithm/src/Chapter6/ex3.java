package Chapter6;

import java.util.Scanner;

public class ex3 {
	public int[] solution(int n, int[] arr) {
		for(int i=1; i<n; i++) {
			
			
			return arr;
		}
	}

	public static void main(String[] args) {
		ex3 T = new ex3();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int x : T.solution(n,arr)) {
			System.out.print(x+" ");
		}
	}
	}


