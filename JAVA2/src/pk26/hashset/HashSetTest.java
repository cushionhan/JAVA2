package pk26.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> hashset=new HashSet<String>();
		//id���鶧�� hashset���� �����ۿ�����
		//���¹�ȣ
		hashset.add(new String("������"));
		hashset.add(new String("����"));
		hashset.add("ȫ����");
//		hashset.add(new String("������"));
//		hashset.add(new String("������"));
		
		boolean b1=hashset.add("������");
		System.out.println(b1);
		
		boolean b2=hashset.add("������");
		System.out.println(b2);
		
		System.out.println(hashset);
		
	}

}
