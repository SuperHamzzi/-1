package Chapter2;

import java.util.Scanner;

public class exam7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count =0;
		int sum = 0;
		for(int i=0;i<N;i++) {
			int result = sc.nextInt();
			if(result==1) {
				count++;
				sum += count;
			}else {
				count=0;
			}
		}
		System.out.println(sum);
		

	}

}
