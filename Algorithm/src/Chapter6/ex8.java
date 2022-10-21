package Chapter6;

import java.util.Arrays;
import java.util.Scanner;

public class ex8 {
	
	public int solution(int n,int m,int[] arr) {
		int answer= 0;
		int lt =0, rt=n-1;
		int mid =0;
		Arrays.sort(arr);
		while(lt<=rt) {
		mid = (rt+lt)/2;
		if(arr[mid]==m) {
			answer= mid+1;
			break;
		}
		if(arr[mid]>m) rt= mid-1;
		else lt= mid+1;
			
		}
		
		return answer; 
	}

	public static void main(String[] args) {
		ex8 T = new ex8();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(T.solution(n,m,arr));
		
		
	}

}
