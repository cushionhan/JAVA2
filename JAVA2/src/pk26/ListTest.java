package pk26;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		//List구조를 갖는 ArrayList class의 instance 생성
		List<String> ls=new ArrayList<String>(); //Collection중 List중 ArrayList를 가져와서 인스턴스ls 생성
		//List에 data 추가
		ls.add("Hi");
		ls.add("Have");
		ls.add("a Nice Day");
		
		for(int i=0;i<ls.size();i++) {
			System.out.println(i+":"+ls.get(i).toString());
		}System.out.println();
		
		ls.add(3,"Everybody"); //3번째에 Everybody add
		for(int i=0;i<ls.size();i++) {
			System.out.println(i+":"+ls.get(i).toString());
		}System.out.println();
		
		ls.remove(0);
		for(int i=0;i<ls.size();i++) {
			System.out.println(i+":"+ls.get(i).toString());
		}System.out.println();
	}

}
