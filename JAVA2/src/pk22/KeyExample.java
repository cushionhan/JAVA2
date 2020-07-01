package pk22;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		//Key객체를 식별키로 하여 String값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> hashMap=new HashMap<Key, String>();  //hashmap(int key, String a){}
		
		//식별키(hashcode)에 put으로 입력
		hashMap.put(new Key(1), "홍길동");
				
		//식별키(hashcode)를 이용하여 값(String)을 읽어옴
		
		String value=hashMap.get(new Key(1));
		System.out.println(value);
		
	}

}
//객체 생성 -> 클래스 생성 -> put -> get -> override(equals,hashcode)