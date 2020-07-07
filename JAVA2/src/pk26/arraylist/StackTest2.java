package pk26.arraylist;

import java.util.ArrayList;
//ArrayList를 Stack화
//arraylist의 메서드를 Stack형으로 overlide
class MyStack{
	private ArrayList<String> arrayStack=new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len=arrayStack.size();
		if(len==0){
			System.out.println("스택이 비어있습니다.");
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
