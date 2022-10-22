package Chapter7;

public class ex2 {
		
	public void DFS(int n) {
			if(n==0)return;
			else {
				
				DFS(n/2);
				System.out.print(n%2+" ");
			}
			
			
		}	//스택 프레임에는 지역변수 매개변수 복귀주소가 저장된다.
		
		
		public static void main(String[] args) {
			ex2 T = new ex2();
			T.DFS(11);
		}
}

