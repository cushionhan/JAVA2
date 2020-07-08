package pk30.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStream {

	public static void main(String[] args) {
		List<String> sList=new ArrayList<String>();
		
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		//���׸� Ÿ���� stream����
		Stream<String> stream=sList.stream();
		//���ٽ� ���: ��Ʈ���� �����Ͽ� �ϳ��� Element�� ������ ����س��� ���ٽ�
		stream.forEach(str->System.out.print(str+" "));
		System.out.println();
		sList.stream().sorted().forEach(str->System.out.print(str+" "));
		System.out.println();
		sList.stream().filter(str->str.length()>=5).forEach(str->System.out.print(str+" "));
		System.out.println();
		sList.stream().map(str->str.length()).forEach(str->System.out.print(str+" "));
		//for(String str:sList) {
		//System.out.println(str);
		//}
	}

}
