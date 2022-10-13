package Chapter4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ex3 {
	
	public ArrayList<Integer> solution(int n,int m,int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
 		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i=0; i<m-1; i++) {
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
		}
		int lt =0;
		for(int rt=m-1; rt<n; rt++) {
			hm.put(arr[rt],hm.getOrDefault(arr[rt], 0)+1);
			answer.add(hm.size());
			hm.put(arr[lt],hm.getOrDefault(arr[lt], 0)-1);
			if(hm.get(arr[lt])==0) hm.remove(arr[lt]);
			lt++;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		ex3 T =new ex3();
		Scanner sc =new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		for(int i =0; i<N; i++) {
			arr[i]=sc.nextInt();
		}
		for(int x: T.solution(N, M, arr))
			System.out.print(x+" ");
	}

}
