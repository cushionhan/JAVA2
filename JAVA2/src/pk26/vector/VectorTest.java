package pk26.vector;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Object obj;
		
		//�뷮 2�� �迭 ����
		Vector<Object> vec=new Vector<Object>(2);
		obj=10;
		vec.addElement(obj); //������Ʈ �߰�
		
		//vector �뷮 ��
		System.out.println("�뷮 #1 : "+vec.capacity());
		
		//vector ������Ʈ ��
		System.out.println("ũ�� #2 : "+vec.size());
		
		obj="Hi";
		vec.addElement(obj); //������Ʈ �߰�
		
		System.out.println("�뷮 #3 : "+vec.capacity());
		System.out.println("ũ�� #4 : "+vec.size());
		
		obj="Nice Day";
		vec.addElement(obj); //������Ʈ �߰�
		
		System.out.println("�뷮 #5 : "+vec.capacity());
		System.out.println("ũ�� #6 : "+vec.size());
		
		System.out.println(vec);
		vec.remove("Hi");
		System.out.println(vec);
		System.out.println("�뷮 #7 : "+vec.capacity());
		System.out.println("ũ�� #8 : "+vec.size());
		vec.remove("Nice Day");
		System.out.println(vec);
		System.out.println("�뷮 #9 : "+vec.capacity());
		System.out.println("ũ�� #10 : "+vec.size());
	}

}
