package pk26.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List<String> list=new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add("DATABASE");
		list.add("Spring");
		
		//�Ѱ�ü��
		System.out.println("�Ѱ�ü�� : "+list.size());
		System.out.println("============================");

		
		//for
		for(int i=0;i<list.size();i++) {
			System.out.println("index"+i+": "+list.get(i));
		}
		
//		for(String a:list) {
//			System.out.println(a);
//		}
		
		System.out.println("============================");

		
		
		//����
		list.remove(0);
		list.remove(0);
		list.remove("DATABASE");
		
		System.out.println("index0,index0,DATABASE ������ ���==>");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		//System.out.println(list);
	}

}
