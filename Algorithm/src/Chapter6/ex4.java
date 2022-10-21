package Chapter6;

import java.util.Scanner;
import java.util.Stack;

public class ex4 {
	public int[] solution(int m,int n, int[] arr) {
		int[] arr2 = new int[m];
		for(int x: arr) {
			int pos =-1;
			for(int i =0; i<m; i++) if(x==arr2[i]) pos=i;
				if(pos==-1) {
					for(int i=m-1; i>=1; i--) {
						arr2[i]=arr2[i-1];
					}
					arr2[0]=x;
				}
				else {for(int i=pos; i>=1; i--) {
					arr2[i]=arr2[i-1];
				}
				arr2[0]=x;
					
				}
			
		}
		
		
		
		return arr2;
		}
	

	public static void main(String[] args) {
		ex4 T = new ex4();
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int x : T.solution(m,n,arr)) {
			System.out.print(x+" ");
		}
	}
	}


