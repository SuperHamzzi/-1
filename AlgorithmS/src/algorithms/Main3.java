package algorithms;

public class Main3 {
	public int solution() {
	int answer=0;
	for(int i=1; i<=100; i++) {
	if(i/2==1) {
		answer	+=i;
	}
	if(i/2==0){
		answer -=i;	
		}
	
	}
	return answer;
}
	public static void main(String[] args) {
		Main3 T = new Main3();
		System.out.println(T.solution());
			
		}

	}


