package chapter23;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapNation {

	public static void main(String[] args) {
		HashMap<String,Integer> nations=new HashMap<String,Integer>();
		Scanner scanner=new Scanner(System.in);
		System.out.println("�����̸��� �α��� �Է��ϼ���. (��: Korea 5000)");
		//�Է�
		while(true) {
			System.out.println("���� �̸�, �α� >> ");
			String nation=scanner.next();
			if(nation.equals("�׸�")) 
				break;
			int population=scanner.nextInt();
			nations.put(nation, population);
			
		}
		//�˻�
		while(true) {
			System.out.println("�α� �˻� >>");
			String nation=scanner.next();	
			if(nation.equals("�׸�")) 
				break;
			
			Integer n=nations.get(nation);
			if(n==null)  
				System.out.println(nation+"����� �����ϴ�.");
			else
				System.out.println(nation+ "�� �α��� "+n);	
			
		}	
		scanner.close();
	}

}
	

