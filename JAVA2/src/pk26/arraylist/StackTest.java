package pk26.arraylist;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Object obj;
		//empty
		Stack<Object>st=new Stack<Object>();
		System.out.println(st.empty());
		if(st.empty()) { 
			for(int i=0;i<3;i++) {
			st.push(new String("Hi!"+i));
			System.out.println("�Է�"+i+"��°"+st.peek());
			}
		}//of
		st.pop();
		System.out.println("���� Top�� ��ġ(peek) : "+st.peek());
		st.pop();
		System.out.println("���� Top�� ��ġ(peek) : "+st.peek());
		st.push(new String("�ϰ����� �Ͽ���"));
		System.out.println(st.peek());
		st.push(new String("ok"));
		System.out.println(st.peek());
	}
}
//push=> Top�� �ֱ�
//peek=> �ֱ� push�� �� ����
//pop=> �ֱ� push�� �� ������(����鼭)