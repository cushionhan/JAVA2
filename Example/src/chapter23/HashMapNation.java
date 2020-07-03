package chapter23;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapNation {

	public static void main(String[] args) {
		HashMap<String,Integer> nations=new HashMap<String,Integer>();
		Scanner scanner=new Scanner(System.in);
		System.out.println("나라이름과 인구를 입력하세요. (예: Korea 5000)");
		//입력
		while(true) {
			System.out.println("나라 이름, 인구 >> ");
			String nation=scanner.next();
			if(nation.equals("그만")) 
				break;
			int population=scanner.nextInt();
			nations.put(nation, population);
			
		}
		//검색
		while(true) {
			System.out.println("인구 검색 >>");
			String nation=scanner.next();	
			if(nation.equals("그만")) 
				break;
			
			Integer n=nations.get(nation);
			if(n==null)  
				System.out.println(nation+"나라는 없습니다.");
			else
				System.out.println(nation+ "의 인구는 "+n);	
			
		}	
		scanner.close();
	}

}
	

