package pk26.vector;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Object obj;
		
		//용량 2의 배열 선언
		Vector<Object> vec=new Vector<Object>(2);
		obj=10;
		vec.addElement(obj); //엘리먼트 추가
		
		//vector 용량 수
		System.out.println("용량 #1 : "+vec.capacity());
		
		//vector 엘리먼트 수
		System.out.println("크기 #2 : "+vec.size());
		
		obj="Hi";
		vec.addElement(obj); //엘리먼트 추가
		
		System.out.println("용량 #3 : "+vec.capacity());
		System.out.println("크기 #4 : "+vec.size());
		
		obj="Nice Day";
		vec.addElement(obj); //엘리먼트 추가
		
		System.out.println("용량 #5 : "+vec.capacity());
		System.out.println("크기 #6 : "+vec.size());
		
		System.out.println(vec);
		vec.remove("Hi");
		System.out.println(vec);
		System.out.println("용량 #7 : "+vec.capacity());
		System.out.println("크기 #8 : "+vec.size());
		vec.remove("Nice Day");
		System.out.println(vec);
		System.out.println("용량 #9 : "+vec.capacity());
		System.out.println("크기 #10 : "+vec.size());
	}

}
