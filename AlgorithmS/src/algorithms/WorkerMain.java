package algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class WorkerMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Worker> list = new ArrayList<>();
		Worker work = new Worker();
		int money; String name;
		for(int i=0; i<1000; i++) {
		name = sc.next();
		if(name.equals("STOP")) {break;}
		money = sc.nextInt();
		work = new Worker(name,money);
		list.add(work);
		}
		System.out.println("성명	출장비	오만원	만원  오천원  천원  오백원  백원  오십원  십원	오원  일원");
		System.out.println("==================================================================================");
		
		System.out.println("==================================================================================");
		System.out.println("전체화폐매수");
	}

}
