package Chapter5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EX9 {
	class Person{
		int id;
		int priority;
		public Person(int id, int priority) {
			this.id = id;
			this.priority=priority;
		}
	}
	
	public int solution(int n,int m,int[] arr) {
		int answer=0;
		Queue<Person> qu = new LinkedList<>();
		for(int i=0;i<n; i++) {
			qu.offer(new Person(i,arr[i]));
		}
		
		
		
		return answer;
	}

	public static void main(String[] args) {
		EX9 T =new EX9();
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N =  sc.nextInt();
		int[] arr=new int[M];
		for(int i=0;i<arr.length;i++) {
			arr[i] =sc.nextInt();
		}
		System.out.println(T.solution(M,N,arr));

	}

}
