package pk26.arraylist;

import java.util.ArrayList;
//ArrayList�� Stackȭ
//arraylist�� �޼��带 Stack������ overlide
class MyStack{
	private ArrayList<String> arrayStack=new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len=arrayStack.size();
		if(len==0){
			System.out.println("������ ����ֽ��ϴ�.");
			return null;
			}
		return(arrayStack.remove(len-1));
	}
	
	 
}

public class StackTest2 {

	public static void main(String[] args) {
		
		MyStack stack=new MyStack();
		
		//System.out.println(stack.pop());
				
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		stack.push("E");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

}
