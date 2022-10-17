package algorithms;

public class Main2 {

	public static void main(String[] args) {
			int[][] t = new int[5][5];
			int value =1;
			
			//요소에 값 넣기
			for(int i=0; i< t.length; i++) {
				for(int j=i; j<t[i].length; j++) {
					t[i][j] =value;
					value++;
				}
			}
			
			//요소에 있는 값 출력
			for(int i=0; i<t.length; i++) {
				for(int j=0; j<t[i].length; j++) {
					if(t[i][j]==0) {
						System.out.printf("%2s\t","");
					}else {
						System.out.printf("%2s\t",t[i][j]);
					}
				}
				System.out.println();
			}
	}

}
