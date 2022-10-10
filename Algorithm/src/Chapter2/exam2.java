package Chapter2;

import java.util.Scanner;

public class exam2 {

	
//	앞수 보다 큰수 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int count = 0;
		int max = 0;
		for(int i=0; i<N; i++) {
			arr[i] =sc.nextInt(); 
		}
		for(int i=0; i<N; i++) {
			if(arr[i]>max) {
				max=arr[i];
				count++;
			}
		
		}
		System.out.println(count);
			
	
	
	
	
	
	
	}
			
	}
