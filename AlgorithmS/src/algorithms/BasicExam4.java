package algorithms;

public class BasicExam4 {
	public static void main(String[] args) {
	int a =2;
	int r =3;
	long sum = a;
	int n=2;
	
	while(n<=10) {
		a *=r;
		sum+= a;
		n++;
	}
	System.out.println(sum);
		
	}
}
