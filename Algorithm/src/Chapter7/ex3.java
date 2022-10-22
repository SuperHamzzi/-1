package Chapter7;

public class ex3 {
		
	public int DFS(int n) {

		if(n==1) return 1;
		else return n*DFS(n-1);
		}

			
			
		
		
		public static void main(String[] args) {
			ex3 T = new ex3();
			System.out.println(T.DFS(5));
		}
}

