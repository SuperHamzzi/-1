package Chapter3;


import java.util.*;



public class ex2 {
	
	public ArrayList<Integer> solution(int n,int m, int[] x,int[] y) {
		ArrayList<Integer> answer = new ArrayList<>();
		Arrays.sort(x);
		Arrays.sort(y);
		int a=0, b=0;
		while(a<n && b<m) {
			if(x[a]==y[b]) {
				answer.add(x[a++]);
				b++;
			}
			else if(x[a]<y[b]) {
				a++;
			}else {
				b++;
			}
		}
				
			return answer;
		
		
		
	
	}
	
	public static void main(String[] args) {
		ex2 T =new ex2();
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		for(int i=0; i<n; i++) {
			arr1[i]=sc.nextInt();
		}
		int m = sc.nextInt();
		int[] arr2 = new int[m];
		for(int i=0; i<n; i++) {
			arr2[i]=sc.nextInt();
		}
		for(int x : T.solution(n,m,arr1,arr2)) {
			System.out.print(x+" ");
		}
	}

	
}
