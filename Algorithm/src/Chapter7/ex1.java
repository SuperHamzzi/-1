package Chapter7;

public class ex1 {
	public void DFS(int n) {
		if(n==0) return;
		else {
			
			DFS(n-1);
			System.out.print(n+" ");
		}
	}
	//스택 프레임에는 지역변수 매개변수 복귀주소가 저장된다.

	public static void main(String[] args) {
		ex1 T = new ex1();
		T.DFS(3);

	}

}
