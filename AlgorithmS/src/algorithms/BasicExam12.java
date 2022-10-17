package algorithms;

public class BasicExam12 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int value =1;
		int m =3; //전체행수/2 =>소수이하는 올림
		
		//#1. 중간행을 기준으로 위쪽설계
		for(int i=0; i<m; i++) {
		for(int j=i; j<5-i; j++) {
			arr[i][j]=value;
			value++;

		}
		}
		for(int i=m; i<arr.length; i++) {
			for(int j=(4-i); j<=i; j++) {
				arr[i][j] =value;
				value++;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}
