package algorithms;

public class BasicExam9 {
	public static void main(String[] args) {
		int[] array = {21,17,4,51,24,75,40,27,28,72};
		int count =0;
		for(int i=0; i<array.length;i++) {
			if(array[i]%3==0 && array[i]%4==0) {
				count++;
			}
		}
		System.out.println(count);
		
	}
}
