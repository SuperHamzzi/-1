package Chapter6;

import java.util.Arrays;
import java.util.Scanner;

public class ex1 {
	

	public static void main(String[] args) {
		ex1 T = new ex1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr =new int[n];
		for(int i =0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
