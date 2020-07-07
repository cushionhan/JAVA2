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
			System.out.println("입력"+i+"번째"+st.peek());
			}
		}//of
		st.pop();
		System.out.println("현재 Top의 위치(peek) : "+st.peek());
		st.pop();
		System.out.println("현재 Top의 위치(peek) : "+st.peek());
		st.push(new String("니가가라 하와이"));
		System.out.println(st.peek());
		st.push(new String("ok"));
		System.out.println(st.peek());
	}
}
//push=> Top에 넣기
//peek=> 최근 push한 값 보기
//pop=> 최근 push한 값 꺼내기(지우면서)