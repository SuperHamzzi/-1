package algorithms;

import java.util.Scanner;

public class BasicExam5 {
	
	public long solution(int n) {
		long answer =0;
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			if(i==0 || i==1) a[i]=1;
			else {
			a[i]=a[i-1]+a[i-2];
			}
			answer+=a[i];
		}
		return answer;
		}
	
	public static void main(String[] args) {
	BasicExam5 T =new BasicExam5();	
	Scanner sc =new Scanner(System.in);
	int N = sc.nextInt();
	System.out.println(T.solution(N));
}
}