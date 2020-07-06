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
		
		//ÃÑ°´Ã¼¼ö
		System.out.println("ÃÑ°´Ã¼¼ö : "+list.size());
		System.out.println("============================");

		
		//for
		for(int i=0;i<list.size();i++) {
			System.out.println("index"+i+": "+list.get(i));
		}
		
//		for(String a:list) {
//			System.out.println(a);
//		}
		
		System.out.println("============================");

		
		
		//»èÁ¦
		list.remove(0);
		list.remove(0);
		list.remove("DATABASE");
		
		System.out.println("index0,index0,DATABASE »èÁ¦ÈÄ °á°ú==>");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		//System.out.println(list);
	}

}
